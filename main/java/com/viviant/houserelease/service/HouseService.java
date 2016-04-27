package com.viviant.houserelease.service;

/**
 * Created by viviant on 16/4/24.
 */
public interface HouseService {

    /**
     *
     * @param address
     * @param bathRoomNum
     * @param bedRoomNUm
     * @param desc
     * @param parlourNum
     * @param pic1
     * @param pic2
     * @param pic3
     * @param picMain
     * @param price
     * @param houseReleaseTime
     * @param type
     * @param state
     * @param size
     * @return
     */
    public abstract int createHouse(String address, int bathRoomNum, int bedRoomNUm, String desc, int parlourNum,
                                    String pic1, String pic2, String pic3, String picMain, double price,
                                    String houseReleaseTime, String type, int state, double size);
}
