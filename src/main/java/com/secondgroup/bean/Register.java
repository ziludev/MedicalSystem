package com.secondgroup.bean;

import java.util.Date;

public class Register {
    private String rid;

    private String name;

    private String idcard;

    private String sinumber;

    private Double registermoney;

    private String phone;

    private Integer ispay;

    private Integer sex;

    private Integer age;

    private Integer consultation;

    private Integer department;

    private Integer did;

    private Integer status;

    private Date registerdate;

    private String remark;

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getSinumber() {
        return sinumber;
    }

    public void setSinumber(String sinumber) {
        this.sinumber = sinumber == null ? null : sinumber.trim();
    }

    public Double getRegistermoney() {
        return registermoney;
    }

    public void setRegistermoney(Double registermoney) {
        this.registermoney = registermoney;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIspay() {
        return ispay;
    }

    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getConsultation() {
        return consultation;
    }

    public void setConsultation(Integer consultation) {
        this.consultation = consultation;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}