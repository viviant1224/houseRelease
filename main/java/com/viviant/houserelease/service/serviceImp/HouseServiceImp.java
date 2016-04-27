package com.viviant.houserelease.service.serviceImp;

import com.viviant.houserelease.dao.HouseDao;
import com.viviant.houserelease.dao.daobean.HouseDaobean;
import com.viviant.houserelease.domain.House;
import com.viviant.houserelease.service.HouseService;

/**
 * Created by viviant on 16/4/24.
 */
public class HouseServiceImp implements HouseService{

    HouseDao houseDaobean = null;

    @Override
    public int createHouse(String address, int bathRoomNum, int bedRoomNUm, String desc, int parlourNum,
                                   String pic1, String pic2, String pic3, String picMain, double price,
                                   String houseReleaseTime, String type, int state, double size) {
        houseDaobean = new HouseDaobean();

        House house = new House();

        house.setAddress(address);
        house.setBathroomNum(bathRoomNum);
        house.setBedroomNum(bedRoomNUm);
        house.setHouseDesc(desc);
        house.setParlourNum(parlourNum);
        house.setPic1(pic1);
        house.setPic2(pic2);
        house.setPic3(pic3);
        house.setPicMain(picMain);
        house.setPrice(price);
        house.setReleaseHouseTime(houseReleaseTime);
        house.setSeenCount(0);
        house.setState(state);
        house.setType(type);
        house.setSize(size);


        return houseDaobean.saveObject(house);
    }
}
