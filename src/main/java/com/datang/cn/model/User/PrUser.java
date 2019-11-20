package com.datang.cn.model.User;

import java.util.Date;

public class PrUser {
    private String id;

    private String phone;

    private String password;

    private String headImg;

    private String name;

    private String email;

    private String status;

    private Date ts;

    private String cmbprovince;

    private String cmbcity;

    private String cmbarea;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getCmbprovince() {
        return cmbprovince;
    }

    public void setCmbprovince(String cmbprovince) {
        this.cmbprovince = cmbprovince == null ? null : cmbprovince.trim();
    }

    public String getCmbcity() {
        return cmbcity;
    }

    public void setCmbcity(String cmbcity) {
        this.cmbcity = cmbcity == null ? null : cmbcity.trim();
    }

    public String getCmbarea() {
        return cmbarea;
    }

    public void setCmbarea(String cmbarea) {
        this.cmbarea = cmbarea == null ? null : cmbarea.trim();
    }
}