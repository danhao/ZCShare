package com.zc.web.data.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Transient;
import com.zc.web.exception.SmallException;
import com.zc.web.message.common.FileMsgProto.FileMsg;
import com.zc.web.message.player.PlayerMsgProto.PlayerMsg;
import com.zc.web.util.FileUtil;
import com.zc.web.util.PropUtil;

@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper=false)
@Data
public class Player extends BaseModel{
	@Id
	private long id; //玩家id
	private String name; //玩家名称
	private String email;
	private String emailValidateCode;
	private String mobile;
	private int mobileValidateCode;
	private String qq;	// qq号
	private String passwd;
	private int money; //玩家RMB
	private int type; // 0个人；1企业	
	private int role; // 0有债务；1催债
	private int status;	// 0：新注册；0001；email已验证；0010：mobile已验证；0100：身份已验证；1000：企业已验证
	private int gender;	 // 0:无；1：男；2：女
	private int rating;	// 信用
	private int idValidating; // 1:申请验证身份
	private int coValidating; // 1:申请验证公司
	private String descript; // 描述
	private int vip;	//0非VIP
	private String head;	// 头像
	
	// 认证
	private String userId;		// 用户身份证/组织机构代码
	private String userName;	// 用户真实姓名
	private String companyName;	// 企业名称
	private String artificialPerson;	// 法人
	private String address;		// 地址
	private String companyAddress; // 注册地址
	private File fileId;	// 用于认证的身份证文件
	private File fileNoneCrime;	// 无犯罪证明
	private File fileCredit;	// 信用报告
	private File fileOrganizationCode;	// 组织机构代码证文件
	private String businessLicence;	// 营业执照号
	private File fileBusinessLicence;	// 营业执照文件
	private String taxNumber;	// 税务登记号
	private File fileTaxNumber;	// 税务登记证文件
	private String accountPermit;	// 开户许可核准号
	private File fileAccountPermit;	// 开户许可证
	private int registeredCapital;	// 注册资金
	private int reqisteredType;		// 注册类型
	private int foundTime;	// 成立时间
	private String businessScope;	// 经营范围
	private String businessAddress;	// 经营地址
	private int validateTime;	// 验证时间
	private String companyPhone;	// 公司联系电话
	private int fiveInOne;	// 五证合一：1是；0否
	
	private int createTime; //账号创建时间
	private int loginTime; //当前登录时间
	private int lastLoginTime; //上次登录时间
	private int banAccountTime = 0; //封号截止时间,单位:s

	private String sid; //请求的session标示
	
	private Alert alert;	// 提醒设置
	
	@Embedded
	private Map<Long, Boolean> bidDebts = new HashMap<Long, Boolean>();	// 我参与的债务(id, 是否结束)
	private List<Long> winDebts = new ArrayList<Long>();	// 我获得的债务
	@Embedded
	private Map<Long, Integer> frozenMoney = new HashMap<Long, Integer>();	// 冻结资金
	
	@Embedded
	private List<MoneyHistory> histories = new ArrayList<MoneyHistory>();

	@Embedded
	private List<Situation> situations = new ArrayList<Situation>();

	@Transient
	private int accessTime = 0;
	
	public PlayerMsg build() throws SmallException{
		PlayerMsg.Builder builder = PlayerMsg.newBuilder();
		PropUtil.copyProperties(builder, this, PlayerMsg.Builder.getDescriptor());
		
		if(this.fileId != null)
			builder.setIdFile(getFileMsg(this.fileId));
		if(this.fileOrganizationCode != null)
			builder.setOrganizationCodeFile(getFileMsg(this.fileOrganizationCode));
		if(this.fileBusinessLicence != null)
			builder.setBusinessLicenceFile(getFileMsg(this.fileBusinessLicence));
		if(this.fileTaxNumber != null)
			builder.setTaxNumberFile(getFileMsg(this.fileTaxNumber));
		if(this.fileAccountPermit != null)
			builder.setAccountPermitFile(getFileMsg(this.fileAccountPermit));
		if(this.fileCredit != null)
			builder.setCreditFile(getFileMsg(this.fileCredit));
		if(this.fileNoneCrime != null)
			builder.setNoneCrimeFile(getFileMsg(this.fileNoneCrime));
		if(this.head != null && !this.head.isEmpty())
			builder.setHead(FileUtil.genDownloadUrl(this.head));
		builder.setPasswd("");
		int money = 0;
		for(Entry<Long, Integer> entry : frozenMoney.entrySet()){
			money += entry.getValue();
		}
		builder.setFrozen(money);
		return builder.build();
	}
	
	@Entity(noClassnameStored = true)
	@Data
	public static class MoneyHistory {
		private long id; 				// id
		private int money;				// 金额
		private int type;				// 1：充值；2：结单；3：保证金返回；4：提现；5：支付保证金
		private int platform;			// 1：银联
		private int time; 				// 操作时间
		private int state;				// 0：失败；1：成功
		private int balance;			// 余额
		private String descript;		// 备注
	}
	
	@Entity(noClassnameStored = true)
	@Data
	public static class Situation {
		private long id; 				// id
		private int type;				// 1：发布债务；2：
		private int time; 				// 产生时间
		private List<String> data;		// 内容
	}
	
	@Entity(noClassnameStored = true)
	@Data
	public static class Alert {
		private int money;				// 金额
		private String location;		// 地点
		private int rate;				// 费率
		private int on;					// 1开启；0关闭
	}
	
	private FileMsg.Builder getFileMsg(File file){
		FileMsg.Builder builder = FileMsg.newBuilder();
		builder.setName(file.getName());
		builder.setUrl(FileUtil.genDownloadUrl(file.getId()));
		
		return builder;
	}
}