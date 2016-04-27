package com.viviant.houserelease.domain;

import java.io.Serializable;

/**
 * Created by viviant on 16/4/21.
 */
public class House implements Serializable{
    private int id;
    private String pic1;
    private String pic2;
    private String pic3;
    private String picMain;
    private int bedroomNum;
    private int bathroomNum;
    private int parlourNum;
    private double price;
    private double size;
    private String address;
    private String houseDesc;
    private int state;
    private String releaseHouseTime;
    private String type;
    private String advantage;
    private String flag1;
    private String flag2;
    private String flag3;
    private String flag4;
    private int seenCount;

    public void setId(int id) {
        this.id = id;
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

    public void setPicMain(String picMain) {
        this.picMain = picMain;
    }

    public void setBedroomNum(int bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    public void setBathroomNum(int bathroomNum) {
        this.bathroomNum = bathroomNum;
    }

    public void setParlourNum(int parlourNum) {
        this.parlourNum = parlourNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setReleaseHouseTime(String releaseHouseTime) {
        this.releaseHouseTime = releaseHouseTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public int getId() {
        return id;
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

    public String getPicMain() {
        return picMain;
    }

    public int getBedroomNum() {
        return bedroomNum;
    }

    public int getBathroomNum() {
        return bathroomNum;
    }

    public int getParlourNum() {
        return parlourNum;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public int getState() {
        return state;
    }

    public String getReleaseHouseTime() {
        return releaseHouseTime;
    }

    public String getType() {
        return type;
    }

    public String getAdvantage() {
        return advantage;
    }

    public String getFlag1() {
        return flag1;
    }

    public String getFlag2() {
        return flag2;
    }

    public String getFlag3() {
        return flag3;
    }

    public String getFlag4() {
        return flag4;
    }

    public int getSeenCount() {
        return seenCount;
    }
}
