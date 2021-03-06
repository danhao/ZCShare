package com.zc.web.config.model;

import java.util.ArrayList;
import java.util.List;

public class ConfigVipExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public ConfigVipExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andLevelIsNull() {
			addCriterion("level is null");
			return (Criteria) this;
		}

		public Criteria andLevelIsNotNull() {
			addCriterion("level is not null");
			return (Criteria) this;
		}

		public Criteria andLevelEqualTo(Integer value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotEqualTo(Integer value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThan(Integer value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThan(Integer value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThanOrEqualTo(Integer value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelIn(List<Integer> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotIn(List<Integer> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelBetween(Integer value1, Integer value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("level not between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andBidLimitIsNull() {
			addCriterion("bid_limit is null");
			return (Criteria) this;
		}

		public Criteria andBidLimitIsNotNull() {
			addCriterion("bid_limit is not null");
			return (Criteria) this;
		}

		public Criteria andBidLimitEqualTo(Integer value) {
			addCriterion("bid_limit =", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitNotEqualTo(Integer value) {
			addCriterion("bid_limit <>", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitGreaterThan(Integer value) {
			addCriterion("bid_limit >", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitGreaterThanOrEqualTo(Integer value) {
			addCriterion("bid_limit >=", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitLessThan(Integer value) {
			addCriterion("bid_limit <", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitLessThanOrEqualTo(Integer value) {
			addCriterion("bid_limit <=", value, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitIn(List<Integer> values) {
			addCriterion("bid_limit in", values, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitNotIn(List<Integer> values) {
			addCriterion("bid_limit not in", values, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitBetween(Integer value1, Integer value2) {
			addCriterion("bid_limit between", value1, value2, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitNotBetween(Integer value1, Integer value2) {
			addCriterion("bid_limit not between", value1, value2, "bidLimit");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoIsNull() {
			addCriterion("bid_limit_co is null");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoIsNotNull() {
			addCriterion("bid_limit_co is not null");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoEqualTo(Integer value) {
			addCriterion("bid_limit_co =", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoNotEqualTo(Integer value) {
			addCriterion("bid_limit_co <>", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoGreaterThan(Integer value) {
			addCriterion("bid_limit_co >", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoGreaterThanOrEqualTo(Integer value) {
			addCriterion("bid_limit_co >=", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoLessThan(Integer value) {
			addCriterion("bid_limit_co <", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoLessThanOrEqualTo(Integer value) {
			addCriterion("bid_limit_co <=", value, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoIn(List<Integer> values) {
			addCriterion("bid_limit_co in", values, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoNotIn(List<Integer> values) {
			addCriterion("bid_limit_co not in", values, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoBetween(Integer value1, Integer value2) {
			addCriterion("bid_limit_co between", value1, value2, "bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andBidLimitCoNotBetween(Integer value1, Integer value2) {
			addCriterion("bid_limit_co not between", value1, value2,
					"bidLimitCo");
			return (Criteria) this;
		}

		public Criteria andCostIsNull() {
			addCriterion("cost is null");
			return (Criteria) this;
		}

		public Criteria andCostIsNotNull() {
			addCriterion("cost is not null");
			return (Criteria) this;
		}

		public Criteria andCostEqualTo(Integer value) {
			addCriterion("cost =", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostNotEqualTo(Integer value) {
			addCriterion("cost <>", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostGreaterThan(Integer value) {
			addCriterion("cost >", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostGreaterThanOrEqualTo(Integer value) {
			addCriterion("cost >=", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostLessThan(Integer value) {
			addCriterion("cost <", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostLessThanOrEqualTo(Integer value) {
			addCriterion("cost <=", value, "cost");
			return (Criteria) this;
		}

		public Criteria andCostIn(List<Integer> values) {
			addCriterion("cost in", values, "cost");
			return (Criteria) this;
		}

		public Criteria andCostNotIn(List<Integer> values) {
			addCriterion("cost not in", values, "cost");
			return (Criteria) this;
		}

		public Criteria andCostBetween(Integer value1, Integer value2) {
			addCriterion("cost between", value1, value2, "cost");
			return (Criteria) this;
		}

		public Criteria andCostNotBetween(Integer value1, Integer value2) {
			addCriterion("cost not between", value1, value2, "cost");
			return (Criteria) this;
		}

		public Criteria andCostCoIsNull() {
			addCriterion("cost_co is null");
			return (Criteria) this;
		}

		public Criteria andCostCoIsNotNull() {
			addCriterion("cost_co is not null");
			return (Criteria) this;
		}

		public Criteria andCostCoEqualTo(Integer value) {
			addCriterion("cost_co =", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoNotEqualTo(Integer value) {
			addCriterion("cost_co <>", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoGreaterThan(Integer value) {
			addCriterion("cost_co >", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cost_co >=", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoLessThan(Integer value) {
			addCriterion("cost_co <", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoLessThanOrEqualTo(Integer value) {
			addCriterion("cost_co <=", value, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoIn(List<Integer> values) {
			addCriterion("cost_co in", values, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoNotIn(List<Integer> values) {
			addCriterion("cost_co not in", values, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoBetween(Integer value1, Integer value2) {
			addCriterion("cost_co between", value1, value2, "costCo");
			return (Criteria) this;
		}

		public Criteria andCostCoNotBetween(Integer value1, Integer value2) {
			addCriterion("cost_co not between", value1, value2, "costCo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table config_vip
	 * @mbggenerated  Mon Jul 27 21:14:54 CST 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table config_vip
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 23 14:12:38 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}