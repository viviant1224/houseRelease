package com.viviant.houserelease.test;

import com.viviant.houserelease.service.serviceImp.HouseServiceImp;
import com.viviant.houserelease.util.DateUtil;

/**
 * Created by viviant on 16/4/26.
 */
public class HouseTest {

    public static void createHouse(HouseServiceImp houseServiceImp) {
        String address="eteewt";
        String housereleaseTime = DateUtil.getCurrentDate();
        int bathroomnum = 2;
        int bedroomnum = 3;
        int parlourNum = 3;
        String desc = "detailooooooooppppp" +
                "psddsdsdsddasdasdasdas";
        String pic1="http://sdasdasdadadasdas.jpg";
        String pic2="http://sdasdasdadadaeeees.jpg";
        String pic3="http://sdasdasdadadahhhsdas.jpg";
        String picmian="http://sdasdasdadadahhhsdsdsaddas.jpg";
        double price = 987.4;

        String type = "fsdfdfsd";
        double size = 342.3;
        int state = 0;




        houseServiceImp.createHouse(address,bathroomnum,bedroomnum,desc,parlourNum,
                                    pic1,pic2,pic3,picmian,price,housereleaseTime,type,state,size);
    }

    public static void main(String [] args) {
        HouseServiceImp houseServiceImp = new HouseServiceImp();
        createHouse(houseServiceImp);

    }
}
