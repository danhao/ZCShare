package com.zc.web.config.model;

import java.io.Serializable;

public class ConfigVip implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column config_vip.id
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column config_vip.level
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column config_vip.bid_limit
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    private Integer bidLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table config_vip
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column config_vip.id
     *
     * @return the value of config_vip.id
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column config_vip.id
     *
     * @param id the value for config_vip.id
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column config_vip.level
     *
     * @return the value of config_vip.level
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column config_vip.level
     *
     * @param level the value for config_vip.level
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column config_vip.bid_limit
     *
     * @return the value of config_vip.bid_limit
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public Integer getBidLimit() {
        return bidLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column config_vip.bid_limit
     *
     * @param bidLimit the value for config_vip.bid_limit
     *
     * @mbggenerated Thu Jul 23 14:12:38 CST 2015
     */
    public void setBidLimit(Integer bidLimit) {
        this.bidLimit = bidLimit;
    }
}