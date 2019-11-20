package com.datang.cn.model.User;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Provider {
    private String id;

    private String name;

    private String providerInfoUser;

    private String providerInfoMember;

    private String cellphone;

    private String password;

    private Integer providerImg;

    private String region;

    private String wechat;

    private String qq;

    private String email;

    private String authFile;

    private String workTime;

    private Date createTime;

    private String tel;

    private Integer recommend;

    private Integer status;

    private String province;

    private String city;

    private String area;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProviderInfoUser() {
        return providerInfoUser;
    }

    public void setProviderInfoUser(String providerInfoUser) {
        this.providerInfoUser = providerInfoUser == null ? null : providerInfoUser.trim();
    }

    public String getProviderInfoMember() {
        return providerInfoMember;
    }

    public void setProviderInfoMember(String providerInfoMember) {
        this.providerInfoMember = providerInfoMember == null ? null : providerInfoMember.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getProviderImg() {
        return providerImg;
    }

    public void setProviderImg(byte[] data) {
        this.providerImg = data == null ? null : data.length;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAuthFile() {
        return authFile;
    }

    public void setAuthFile(String authFile) {
        this.authFile = authFile == null ? null : authFile.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id='" + id + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}