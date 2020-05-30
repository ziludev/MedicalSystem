package com.secondgroup.bean;

public class Medicine {
    private String mid;

    private String picture;

    private Double inprice;

    private Double salprice;

    private String name;

    private Integer type;

    private String descs;

    private Integer qualitydate;

    private String description;

    private String producefirm;

    private String readme;

    private String remark;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Double getInprice() {
        return inprice;
    }

    public void setInprice(Double inprice) {
        this.inprice = inprice;
    }

    public Double getSalprice() {
        return salprice;
    }

    public void setSalprice(Double salprice) {
        this.salprice = salprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs == null ? null : descs.trim();
    }

    public Integer getQualitydate() {
        return qualitydate;
    }

    public void setQualitydate(Integer qualitydate) {
        this.qualitydate = qualitydate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProducefirm() {
        return producefirm;
    }

    public void setProducefirm(String producefirm) {
        this.producefirm = producefirm == null ? null : producefirm.trim();
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme == null ? null : readme.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}