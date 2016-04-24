package com.viviant.houserelease.domain;

/**
 * Created by viviant on 16/4/21.
 */
public class Company {
    private int id;
    private String companyName;
    private String companyDesc;
    private String logoPic;
    private String pic1;
    private String pic2;
    private String pic3;
    private String pic4;
    private String address;

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public String getPic1() {
        return pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
