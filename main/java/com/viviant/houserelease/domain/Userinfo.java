package com.viviant.houserelease.domain;

import java.io.Serializable;

/**
 * Created by viviant on 16/4/21.
 */
public class Userinfo implements Serializable {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String telphone;
    private String email;
    private String address;
    private String state;
    private String role;
    private String photo;
    private String registerTime;

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {

        return role;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {

        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getTelphone() {
        return telphone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
