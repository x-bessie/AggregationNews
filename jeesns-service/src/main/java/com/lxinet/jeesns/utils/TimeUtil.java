package com.lxinet.jeesns.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 获取当前时间的各种格式
 */
public class TimeUtil {

    public static long getStartTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime().getTime();
    }

    public static Long getEndTime() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime().getTime();
    }

    public static String longToString() {
        String dateType = "yyyyMMddhh";
        SimpleDateFormat formatter = new SimpleDateFormat(dateType);
        Date date = new Date(getStartTime());
        return formatter.format(date);
    }

    /**
     * @获取当前的前七天时间
     */
    public static String lastdaylongtoString() {
        Date date = new Date();
        Date befordate = new Date();
        String dateType = "yyyyMMddhh";
        SimpleDateFormat formatter = new SimpleDateFormat(dateType);
        Calendar calendar = Calendar.getInstance();//得到当前日历
        calendar.setTime(date);//当前时间设给Date
        calendar.add(Calendar.DAY_OF_MONTH, -30);//当前时间的前七天
        befordate = calendar.getTime();//得到时间

        return formatter.format(befordate);
    }

    /**
     * @获取当前的前七天时间戳
     */
    public static long longToNowString() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    public static Date longToString(long time) {
        String dateType = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(dateType);
        Date date = new Date(time);
        return date;
    }

    public static long stringToLongTime(String strTime) {
        if (strTime == null || "".equalsIgnoreCase(strTime.trim())) {
            return 0;
        }
        String dateType = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(dateType);
        Date date = null;
        try {
            date = formatter.parse(strTime);
            if (date == null) {
                return 0;
            } else {
                long currentTime = date.getTime(); // date类型转成long类型
                return currentTime;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * 当前时间戳
     *
     * @return
     */
    public static long nowToString() {
        long calendar = Calendar.getInstance().getTimeInMillis();
        return calendar;
    }

    /**
     * 当前时间格式化为:yyyy-MM-dd HH:mm:ss
     *
     * @param
     */
    public static String tonowlongString() {
        String dateType = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(dateType);
        Date date = new Date();
        return formatter.format(date);
    }

    public static void main(String[] args) {
//        System.out.println(longToString());
//        System.out.println(lastdaylongtoString());
//        System.out.println(longToNowString());
//        System.out.println(nowToString());
        System.out.println(tonowlongString());

    }
}
