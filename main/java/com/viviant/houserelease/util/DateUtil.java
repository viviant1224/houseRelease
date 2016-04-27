package com.viviant.houserelease.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: viviant
 * Date: 15-5-4
 * Time: 上午10:02
 * To change this template use File | Settings | File Templates.
 */
public class DateUtil {
    public static String getCurrentDate () {
        Date date  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(date);
        return dateTime;
    }

    public static  int getCurrentWeek() {
        Calendar cal = Calendar.getInstance();
        int currentWeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        return currentWeekOfYear;
    }
    public static int getDay() {
        Calendar cal = Calendar.getInstance();
        Date today = new Date();
        cal.setTime(today);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public static void main (String [] args) {
        System.out.println(DateUtil.getCurrentDate());
    }
}
