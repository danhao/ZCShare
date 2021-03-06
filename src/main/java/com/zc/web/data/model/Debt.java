package com.zc.web.data.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import org.apache.log4j.Logger;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.zc.web.core.Constant;
import com.zc.web.exception.SmallException;
import com.zc.web.message.common.ContactMsgProto.ContactMsg;
import com.zc.web.message.common.FileMsgProto.FileMsg;
import com.zc.web.message.debt.DebtMsgProto.DebtMsg;
import com.zc.web.message.debt.MessageMsgProto.MessageMsg;
import com.zc.web.util.FileUtil;
import com.zc.web.util.PropUtil;
import com.zc.web.util.StringUtil;
import com.zc.web.util.TimeUtil;

@Entity(noClassnameStored = true)
@EqualsAndHashCode(callSuper = false)
@Data
public class Debt extends BaseModel {
	private static final Logger logger = Logger.getLogger(Debt.class);

	@Id
	private long id; // id
	private int money;
	private int type;
	private int price;
	private int rate;
	private int duration;
	private int expireDays;
	private int state; // 0未审核；1已通过；2未通过；3已成交；4已完成；
	private int bidIncrease; // 加价幅度
	private int isCorp;	// 是否企业单
	private int property;	// 债务性质

	private long ownerId; // 发布人
	private String ownerName;

	private long winnerId; // 获单人
	private String winnerName;
	private String winnerHead;

	private String creditorName;
	private File creditorFileId;

	private String debtorName;
//	private String debtorPhone;
	private String debtorId;
	private String debtorLocation;
	private String debtorAddr;
	private String debtorEmail;
	private String debtorContactAddr;
	private String debtorPostcode;
//	private String debtorHomePhone;
	private String debtorHukouAddr;
	private String debtorCorpAddr;
	private String debtorCorpName;
//	private String debtorCorpPhone;
	private int debtExpireTime;
	private String mortgage;
	private int judgementTime;
	private String reason;
	private String descript;
	@Embedded
	private List<File> files = new ArrayList<File>();
	@Embedded
	private List<Contact> contacts = new ArrayList<Contact>();

	private int newestMessage;	// 最新的催收动态
	
	private int createTime; // 创建时间
	private int publishTime;// 审核时间
	private int endTime; // 结束时间
	private int receiveTime; // 接单时间

	private List<Long> bondBidders = new ArrayList<Long>(); // 已交保证金ID

	private int bidMoney; // 当前最高的投标金额
	private long bidId; // 当前最高的投标ID

	@Embedded
	private List<Bidder> bidders = new ArrayList<Bidder>();// 投标人列表

	@Embedded
	private List<Message> messages = new ArrayList<Message>(); // 催收状态

	@Embedded
	private List<Repayment> repayments = new ArrayList<Repayment>(); // 还款记录

	public DebtMsg build() throws SmallException {
		return this.build(false, false, 0);
	}

	public DebtMsg build(boolean hide, boolean checkCanReturn, int canEnd) throws SmallException {
		DebtMsg.Builder builder = DebtMsg.newBuilder();
		PropUtil.copyProperties(builder, this, DebtMsg.Builder.getDescriptor());

		for (Bidder bidder : bidders) {
			com.zc.web.message.debt.DebtMsgProto.DebtMsg.Bidder.Builder bb = com.zc.web.message.debt.DebtMsgProto.DebtMsg.Bidder
					.newBuilder();
			PropUtil.copyProperties(bb, bidder,
					com.zc.web.message.debt.DebtMsgProto.DebtMsg.Bidder
							.getDescriptor());
			if(bidder.getHead() != null && !bidder.getHead().isEmpty())
				bb.setHead(FileUtil.genDownloadUrl(bidder.getHead()));
			builder.addBidders(0, bb);
		}

		for (Message message : messages) {
			MessageMsg.Builder bb = MessageMsg.newBuilder();
			PropUtil.copyProperties(bb, message, MessageMsg.getDescriptor());
			for(File file : message.getFiles()){
				FileMsg.Builder fb = FileMsg.newBuilder();
				fb.setName(file.getName());
				fb.setUrl(FileUtil.genDownloadUrl(file.getId()));
				bb.addFiles(fb);
			}
			builder.addMessages(0, bb);
		}

		for (File file : files) {
			FileMsg.Builder fb = FileMsg.newBuilder();
			fb.setId(file.getId());
			fb.setName(file.getName());
			fb.setUrl(FileUtil.genDownloadUrl(file.getId()));
			builder.addFiles(fb);
		}

		if(!hide){
			for (Contact contact : contacts) {
				ContactMsg.Builder cb = ContactMsg.newBuilder();
				PropUtil.copyProperties(cb, contact, ContactMsg.getDescriptor());
				builder.addContacts(cb);
			}
		}

		for (Repayment pay : repayments) {
			com.zc.web.message.debt.DebtMsgProto.DebtMsg.Repayment.Builder fb = com.zc.web.message.debt.DebtMsgProto.DebtMsg.Repayment.newBuilder();
			PropUtil.copyProperties(fb, pay,
					com.zc.web.message.debt.DebtMsgProto.DebtMsg.Repayment
							.getDescriptor());
			builder.addRepayments(fb);
		}

		if (this.creditorFileId != null) {
			FileMsg.Builder fb = FileMsg.newBuilder();
			fb.setId(this.creditorFileId.getId());
			fb.setName(this.creditorFileId.getName());
			fb.setUrl(FileUtil.genDownloadUrl(this.creditorFileId.getId()));
			builder.setCreditorIdFile(fb);
		}

		if (this.type == Constant.TYPE_DEPUTY
				&& (this.state == Constant.STATE_DEALED || this.state == Constant.STATE_CLOSED)) {
			FileMsg.Builder fb = FileMsg.newBuilder();
			fb.setName(this.type == Constant.TYPE_DEPUTY ? "委托协议" : "拍卖协议");
			fb.setUrl(FileUtil.genDownloadUrl("contract/" + this.id + ".pdf"));
			builder.setContract(fb);
		}

		if(winnerHead != null && !winnerHead.isEmpty())
			builder.setWinnerHead(FileUtil.genDownloadUrl(winnerHead));
		
		if (hide) {
			builder.setDebtorName(StringUtil.show(this.debtorName, 1));
			builder.setDebtorAddr(StringUtil.show(this.debtorAddr, 6));
			builder.setDebtorId(StringUtil.hide(this.debtorId, 8));
			builder.setDebtorCorpName(StringUtil.show(this.debtorCorpName, 6));
			builder.setDebtorCorpAddr(StringUtil.show(this.debtorCorpAddr, 6));
			builder.setDebtorHukouAddr(StringUtil.show(this.debtorHukouAddr, 6));
		}
		
		if(checkCanReturn && this.state == Constant.STATE_DEALED){
			if(this.repayments.size() == 0){
				if(this.type == Constant.TYPE_BID)
					builder.setCanEnd(canEnd);
				else if((TimeUtil.now() - this.publishTime) / Constant.ONE_DAY >= Constant.DEBT_RETURN_LIMIT)
					builder.setCanReturn(1);
			}else{
				builder.setCanEnd(canEnd);
			}
		}
		
		return builder.build();
	}
	
	public void updateState(int state){
		this.state = state;
	}
	
	@Entity(noClassnameStored = true)
	@Data
	public static class Bidder {
		private long id;
		private String name;
		private int money; // 投标价格
		private int rate; // 代理费率
		private int createTime;
		private String head;
		private int rating;	// 信用
	}

	@Entity(noClassnameStored = true)
	@Data
	public static class Message {
		private int time; // 时间
		private int type; // 类型
		private String memo; // 说明
		
		@Embedded
		private List<File> files = new ArrayList<File>();	// 上传文件
	}
	
	@Entity(noClassnameStored = true)
	@Data
	public static class Repayment {
		private int time; // 时间
		private int money; // 金额
		private String memo; // 说明
	}

	@Entity(noClassnameStored = true)
	@Data
	public static class Contact {
		private String phone;	// 电话
		private String name;	// 姓名
		private int type;		// 类型
		private String memo; 	// 说明
	}
}
