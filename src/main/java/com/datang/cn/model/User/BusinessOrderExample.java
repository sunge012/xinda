package com.datang.cn.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessOrderExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;
	
	protected int pageSize;

	protected int pageStart;

	protected String ordername;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public BusinessOrderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

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

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andBusinessNoIsNull() {
			addCriterion("business_no is null");
			return (Criteria) this;
		}

		public Criteria andBusinessNoIsNotNull() {
			addCriterion("business_no is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessNoEqualTo(String value) {
			addCriterion("business_no =", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotEqualTo(String value) {
			addCriterion("business_no <>", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoGreaterThan(String value) {
			addCriterion("business_no >", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoGreaterThanOrEqualTo(String value) {
			addCriterion("business_no >=", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLessThan(String value) {
			addCriterion("business_no <", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLessThanOrEqualTo(String value) {
			addCriterion("business_no <=", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLike(String value) {
			addCriterion("business_no like", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotLike(String value) {
			addCriterion("business_no not like", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoIn(List<String> values) {
			addCriterion("business_no in", values, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotIn(List<String> values) {
			addCriterion("business_no not in", values, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoBetween(String value1, String value2) {
			addCriterion("business_no between", value1, value2, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotBetween(String value1, String value2) {
			addCriterion("business_no not between", value1, value2, "businessNo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNull() {
			addCriterion("order_info is null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNotNull() {
			addCriterion("order_info is not null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoEqualTo(String value) {
			addCriterion("order_info =", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotEqualTo(String value) {
			addCriterion("order_info <>", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThan(String value) {
			addCriterion("order_info >", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
			addCriterion("order_info >=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThan(String value) {
			addCriterion("order_info <", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThanOrEqualTo(String value) {
			addCriterion("order_info <=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLike(String value) {
			addCriterion("order_info like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotLike(String value) {
			addCriterion("order_info not like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIn(List<String> values) {
			addCriterion("order_info in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotIn(List<String> values) {
			addCriterion("order_info not in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoBetween(String value1, String value2) {
			addCriterion("order_info between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotBetween(String value1, String value2) {
			addCriterion("order_info not between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("member_id like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("member_id not like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andOrderSumIsNull() {
			addCriterion("order_sum is null");
			return (Criteria) this;
		}

		public Criteria andOrderSumIsNotNull() {
			addCriterion("order_sum is not null");
			return (Criteria) this;
		}

		public Criteria andOrderSumEqualTo(Integer value) {
			addCriterion("order_sum =", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumNotEqualTo(Integer value) {
			addCriterion("order_sum <>", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumGreaterThan(Integer value) {
			addCriterion("order_sum >", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumGreaterThanOrEqualTo(Integer value) {
			addCriterion("order_sum >=", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumLessThan(Integer value) {
			addCriterion("order_sum <", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumLessThanOrEqualTo(Integer value) {
			addCriterion("order_sum <=", value, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumIn(List<Integer> values) {
			addCriterion("order_sum in", values, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumNotIn(List<Integer> values) {
			addCriterion("order_sum not in", values, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumBetween(Integer value1, Integer value2) {
			addCriterion("order_sum between", value1, value2, "orderSum");
			return (Criteria) this;
		}

		public Criteria andOrderSumNotBetween(Integer value1, Integer value2) {
			addCriterion("order_sum not between", value1, value2, "orderSum");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andEvaluateIsNull() {
			addCriterion("evaluate is null");
			return (Criteria) this;
		}

		public Criteria andEvaluateIsNotNull() {
			addCriterion("evaluate is not null");
			return (Criteria) this;
		}

		public Criteria andEvaluateEqualTo(String value) {
			addCriterion("evaluate =", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotEqualTo(String value) {
			addCriterion("evaluate <>", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateGreaterThan(String value) {
			addCriterion("evaluate >", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
			addCriterion("evaluate >=", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLessThan(String value) {
			addCriterion("evaluate <", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLessThanOrEqualTo(String value) {
			addCriterion("evaluate <=", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLike(String value) {
			addCriterion("evaluate like", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotLike(String value) {
			addCriterion("evaluate not like", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateIn(List<String> values) {
			addCriterion("evaluate in", values, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotIn(List<String> values) {
			addCriterion("evaluate not in", values, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateBetween(String value1, String value2) {
			addCriterion("evaluate between", value1, value2, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotBetween(String value1, String value2) {
			addCriterion("evaluate not between", value1, value2, "evaluate");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNull() {
			addCriterion("pay_type is null");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNotNull() {
			addCriterion("pay_type is not null");
			return (Criteria) this;
		}

		public Criteria andPayTypeEqualTo(Integer value) {
			addCriterion("pay_type =", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotEqualTo(Integer value) {
			addCriterion("pay_type <>", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThan(Integer value) {
			addCriterion("pay_type >", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("pay_type >=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThan(Integer value) {
			addCriterion("pay_type <", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
			addCriterion("pay_type <=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeIn(List<Integer> values) {
			addCriterion("pay_type in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotIn(List<Integer> values) {
			addCriterion("pay_type not in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeBetween(Integer value1, Integer value2) {
			addCriterion("pay_type between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("pay_type not between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andBnameIsNull() {
			addCriterion("bname is null");
			return (Criteria) this;
		}

		public Criteria andBnameIsNotNull() {
			addCriterion("bname is not null");
			return (Criteria) this;
		}

		public Criteria andBnameEqualTo(String value) {
			addCriterion("bname =", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameNotEqualTo(String value) {
			addCriterion("bname <>", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameGreaterThan(String value) {
			addCriterion("bname >", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameGreaterThanOrEqualTo(String value) {
			addCriterion("bname >=", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameLessThan(String value) {
			addCriterion("bname <", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameLessThanOrEqualTo(String value) {
			addCriterion("bname <=", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameLike(String value) {
			addCriterion("bname like", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameNotLike(String value) {
			addCriterion("bname not like", value, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameIn(List<String> values) {
			addCriterion("bname in", values, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameNotIn(List<String> values) {
			addCriterion("bname not in", values, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameBetween(String value1, String value2) {
			addCriterion("bname between", value1, value2, "bname");
			return (Criteria) this;
		}

		public Criteria andBnameNotBetween(String value1, String value2) {
			addCriterion("bname not between", value1, value2, "bname");
			return (Criteria) this;
		}

		public Criteria andDianhuaIsNull() {
			addCriterion("dianhua is null");
			return (Criteria) this;
		}

		public Criteria andDianhuaIsNotNull() {
			addCriterion("dianhua is not null");
			return (Criteria) this;
		}

		public Criteria andDianhuaEqualTo(Integer value) {
			addCriterion("dianhua =", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotEqualTo(Integer value) {
			addCriterion("dianhua <>", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaGreaterThan(Integer value) {
			addCriterion("dianhua >", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaGreaterThanOrEqualTo(Integer value) {
			addCriterion("dianhua >=", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaLessThan(Integer value) {
			addCriterion("dianhua <", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaLessThanOrEqualTo(Integer value) {
			addCriterion("dianhua <=", value, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaIn(List<Integer> values) {
			addCriterion("dianhua in", values, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotIn(List<Integer> values) {
			addCriterion("dianhua not in", values, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaBetween(Integer value1, Integer value2) {
			addCriterion("dianhua between", value1, value2, "dianhua");
			return (Criteria) this;
		}

		public Criteria andDianhuaNotBetween(Integer value1, Integer value2) {
			addCriterion("dianhua not between", value1, value2, "dianhua");
			return (Criteria) this;
		}

		public Criteria andBnumIsNull() {
			addCriterion("bnum is null");
			return (Criteria) this;
		}

		public Criteria andBnumIsNotNull() {
			addCriterion("bnum is not null");
			return (Criteria) this;
		}

		public Criteria andBnumEqualTo(Integer value) {
			addCriterion("bnum =", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumNotEqualTo(Integer value) {
			addCriterion("bnum <>", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumGreaterThan(Integer value) {
			addCriterion("bnum >", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("bnum >=", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumLessThan(Integer value) {
			addCriterion("bnum <", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumLessThanOrEqualTo(Integer value) {
			addCriterion("bnum <=", value, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumIn(List<Integer> values) {
			addCriterion("bnum in", values, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumNotIn(List<Integer> values) {
			addCriterion("bnum not in", values, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumBetween(Integer value1, Integer value2) {
			addCriterion("bnum between", value1, value2, "bnum");
			return (Criteria) this;
		}

		public Criteria andBnumNotBetween(Integer value1, Integer value2) {
			addCriterion("bnum not between", value1, value2, "bnum");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

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

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}