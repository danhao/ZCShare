package com.zc.web.config.mapper;

import com.zc.web.config.model.ConfigVip;
import com.zc.web.config.model.ConfigVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigVipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int countByExample(ConfigVipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int deleteByExample(ConfigVipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int insert(ConfigVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int insertSelective(ConfigVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    List<ConfigVip> selectByExample(ConfigVipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    ConfigVip selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int updateByExampleSelective(@Param("record") ConfigVip record, @Param("example") ConfigVipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int updateByExample(@Param("record") ConfigVip record, @Param("example") ConfigVipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int updateByPrimaryKeySelective(ConfigVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    int updateByPrimaryKey(ConfigVip record);
}