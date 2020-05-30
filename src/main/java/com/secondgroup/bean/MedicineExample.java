package com.secondgroup.bean;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNull() {
            addCriterion("inPrice is null");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNotNull() {
            addCriterion("inPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInpriceEqualTo(Double value) {
            addCriterion("inPrice =", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotEqualTo(Double value) {
            addCriterion("inPrice <>", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThan(Double value) {
            addCriterion("inPrice >", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("inPrice >=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThan(Double value) {
            addCriterion("inPrice <", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThanOrEqualTo(Double value) {
            addCriterion("inPrice <=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceIn(List<Double> values) {
            addCriterion("inPrice in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotIn(List<Double> values) {
            addCriterion("inPrice not in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceBetween(Double value1, Double value2) {
            addCriterion("inPrice between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotBetween(Double value1, Double value2) {
            addCriterion("inPrice not between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceIsNull() {
            addCriterion("salPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalpriceIsNotNull() {
            addCriterion("salPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalpriceEqualTo(Double value) {
            addCriterion("salPrice =", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotEqualTo(Double value) {
            addCriterion("salPrice <>", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceGreaterThan(Double value) {
            addCriterion("salPrice >", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("salPrice >=", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceLessThan(Double value) {
            addCriterion("salPrice <", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceLessThanOrEqualTo(Double value) {
            addCriterion("salPrice <=", value, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceIn(List<Double> values) {
            addCriterion("salPrice in", values, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotIn(List<Double> values) {
            addCriterion("salPrice not in", values, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceBetween(Double value1, Double value2) {
            addCriterion("salPrice between", value1, value2, "salprice");
            return (Criteria) this;
        }

        public Criteria andSalpriceNotBetween(Double value1, Double value2) {
            addCriterion("salPrice not between", value1, value2, "salprice");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDescsIsNull() {
            addCriterion("descs is null");
            return (Criteria) this;
        }

        public Criteria andDescsIsNotNull() {
            addCriterion("descs is not null");
            return (Criteria) this;
        }

        public Criteria andDescsEqualTo(String value) {
            addCriterion("descs =", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotEqualTo(String value) {
            addCriterion("descs <>", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsGreaterThan(String value) {
            addCriterion("descs >", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsGreaterThanOrEqualTo(String value) {
            addCriterion("descs >=", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLessThan(String value) {
            addCriterion("descs <", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLessThanOrEqualTo(String value) {
            addCriterion("descs <=", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLike(String value) {
            addCriterion("descs like", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotLike(String value) {
            addCriterion("descs not like", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsIn(List<String> values) {
            addCriterion("descs in", values, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotIn(List<String> values) {
            addCriterion("descs not in", values, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsBetween(String value1, String value2) {
            addCriterion("descs between", value1, value2, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotBetween(String value1, String value2) {
            addCriterion("descs not between", value1, value2, "descs");
            return (Criteria) this;
        }

        public Criteria andQualitydateIsNull() {
            addCriterion("qualityDate is null");
            return (Criteria) this;
        }

        public Criteria andQualitydateIsNotNull() {
            addCriterion("qualityDate is not null");
            return (Criteria) this;
        }

        public Criteria andQualitydateEqualTo(Integer value) {
            addCriterion("qualityDate =", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateNotEqualTo(Integer value) {
            addCriterion("qualityDate <>", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateGreaterThan(Integer value) {
            addCriterion("qualityDate >", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualityDate >=", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateLessThan(Integer value) {
            addCriterion("qualityDate <", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateLessThanOrEqualTo(Integer value) {
            addCriterion("qualityDate <=", value, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateIn(List<Integer> values) {
            addCriterion("qualityDate in", values, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateNotIn(List<Integer> values) {
            addCriterion("qualityDate not in", values, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateBetween(Integer value1, Integer value2) {
            addCriterion("qualityDate between", value1, value2, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andQualitydateNotBetween(Integer value1, Integer value2) {
            addCriterion("qualityDate not between", value1, value2, "qualitydate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andProducefirmIsNull() {
            addCriterion("produceFirm is null");
            return (Criteria) this;
        }

        public Criteria andProducefirmIsNotNull() {
            addCriterion("produceFirm is not null");
            return (Criteria) this;
        }

        public Criteria andProducefirmEqualTo(String value) {
            addCriterion("produceFirm =", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmNotEqualTo(String value) {
            addCriterion("produceFirm <>", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmGreaterThan(String value) {
            addCriterion("produceFirm >", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmGreaterThanOrEqualTo(String value) {
            addCriterion("produceFirm >=", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmLessThan(String value) {
            addCriterion("produceFirm <", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmLessThanOrEqualTo(String value) {
            addCriterion("produceFirm <=", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmLike(String value) {
            addCriterion("produceFirm like", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmNotLike(String value) {
            addCriterion("produceFirm not like", value, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmIn(List<String> values) {
            addCriterion("produceFirm in", values, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmNotIn(List<String> values) {
            addCriterion("produceFirm not in", values, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmBetween(String value1, String value2) {
            addCriterion("produceFirm between", value1, value2, "producefirm");
            return (Criteria) this;
        }

        public Criteria andProducefirmNotBetween(String value1, String value2) {
            addCriterion("produceFirm not between", value1, value2, "producefirm");
            return (Criteria) this;
        }

        public Criteria andReadmeIsNull() {
            addCriterion("readme is null");
            return (Criteria) this;
        }

        public Criteria andReadmeIsNotNull() {
            addCriterion("readme is not null");
            return (Criteria) this;
        }

        public Criteria andReadmeEqualTo(String value) {
            addCriterion("readme =", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotEqualTo(String value) {
            addCriterion("readme <>", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeGreaterThan(String value) {
            addCriterion("readme >", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeGreaterThanOrEqualTo(String value) {
            addCriterion("readme >=", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLessThan(String value) {
            addCriterion("readme <", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLessThanOrEqualTo(String value) {
            addCriterion("readme <=", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLike(String value) {
            addCriterion("readme like", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotLike(String value) {
            addCriterion("readme not like", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeIn(List<String> values) {
            addCriterion("readme in", values, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotIn(List<String> values) {
            addCriterion("readme not in", values, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeBetween(String value1, String value2) {
            addCriterion("readme between", value1, value2, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotBetween(String value1, String value2) {
            addCriterion("readme not between", value1, value2, "readme");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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