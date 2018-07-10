package cc.kq.po;

import java.util.ArrayList;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        public Criteria andStunumIsNull() {
            addCriterion("stunum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stunum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(String value) {
            addCriterion("stunum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(String value) {
            addCriterion("stunum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(String value) {
            addCriterion("stunum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(String value) {
            addCriterion("stunum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(String value) {
            addCriterion("stunum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(String value) {
            addCriterion("stunum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLike(String value) {
            addCriterion("stunum like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotLike(String value) {
            addCriterion("stunum not like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<String> values) {
            addCriterion("stunum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<String> values) {
            addCriterion("stunum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(String value1, String value2) {
            addCriterion("stunum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(String value1, String value2) {
            addCriterion("stunum not between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andTeanumIsNull() {
            addCriterion("teanum is null");
            return (Criteria) this;
        }

        public Criteria andTeanumIsNotNull() {
            addCriterion("teanum is not null");
            return (Criteria) this;
        }

        public Criteria andTeanumEqualTo(String value) {
            addCriterion("teanum =", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumNotEqualTo(String value) {
            addCriterion("teanum <>", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumGreaterThan(String value) {
            addCriterion("teanum >", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumGreaterThanOrEqualTo(String value) {
            addCriterion("teanum >=", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumLessThan(String value) {
            addCriterion("teanum <", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumLessThanOrEqualTo(String value) {
            addCriterion("teanum <=", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumLike(String value) {
            addCriterion("teanum like", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumNotLike(String value) {
            addCriterion("teanum not like", value, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumIn(List<String> values) {
            addCriterion("teanum in", values, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumNotIn(List<String> values) {
            addCriterion("teanum not in", values, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumBetween(String value1, String value2) {
            addCriterion("teanum between", value1, value2, "teanum");
            return (Criteria) this;
        }

        public Criteria andTeanumNotBetween(String value1, String value2) {
            addCriterion("teanum not between", value1, value2, "teanum");
            return (Criteria) this;
        }

        public Criteria andLeavecontextIsNull() {
            addCriterion("Leavecontext is null");
            return (Criteria) this;
        }

        public Criteria andLeavecontextIsNotNull() {
            addCriterion("Leavecontext is not null");
            return (Criteria) this;
        }

        public Criteria andLeavecontextEqualTo(String value) {
            addCriterion("Leavecontext =", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextNotEqualTo(String value) {
            addCriterion("Leavecontext <>", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextGreaterThan(String value) {
            addCriterion("Leavecontext >", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextGreaterThanOrEqualTo(String value) {
            addCriterion("Leavecontext >=", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextLessThan(String value) {
            addCriterion("Leavecontext <", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextLessThanOrEqualTo(String value) {
            addCriterion("Leavecontext <=", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextLike(String value) {
            addCriterion("Leavecontext like", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextNotLike(String value) {
            addCriterion("Leavecontext not like", value, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextIn(List<String> values) {
            addCriterion("Leavecontext in", values, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextNotIn(List<String> values) {
            addCriterion("Leavecontext not in", values, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextBetween(String value1, String value2) {
            addCriterion("Leavecontext between", value1, value2, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavecontextNotBetween(String value1, String value2) {
            addCriterion("Leavecontext not between", value1, value2, "leavecontext");
            return (Criteria) this;
        }

        public Criteria andLeavstateIsNull() {
            addCriterion("Leavstate is null");
            return (Criteria) this;
        }

        public Criteria andLeavstateIsNotNull() {
            addCriterion("Leavstate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavstateEqualTo(Integer value) {
            addCriterion("Leavstate =", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateNotEqualTo(Integer value) {
            addCriterion("Leavstate <>", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateGreaterThan(Integer value) {
            addCriterion("Leavstate >", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Leavstate >=", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateLessThan(Integer value) {
            addCriterion("Leavstate <", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateLessThanOrEqualTo(Integer value) {
            addCriterion("Leavstate <=", value, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateIn(List<Integer> values) {
            addCriterion("Leavstate in", values, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateNotIn(List<Integer> values) {
            addCriterion("Leavstate not in", values, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateBetween(Integer value1, Integer value2) {
            addCriterion("Leavstate between", value1, value2, "leavstate");
            return (Criteria) this;
        }

        public Criteria andLeavstateNotBetween(Integer value1, Integer value2) {
            addCriterion("Leavstate not between", value1, value2, "leavstate");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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