package com.bsoft.one.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public class DateUtils {

    public final static char[] upper = "零一二三四五六七八九十".toCharArray();
    /**
     * 获取当前日期是星期几<br>
     *
     * @param dt
     * @return 当前日期是星期几
     */
    public static int getWeekOfDate(Date dt) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        return cal.get(Calendar.DAY_OF_WEEK)-1;
    }
    /**
     * 根据小写数字格式的日期转换成大写格式的日期
     * @param currentday
     * @return
     */
    public static String getUpperDate(Date currentday) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date =  format.format(currentday);
        //支持yyyy-MM-dd、yyyy/MM/dd、yyyyMMdd等格式
        if(date == null) return null;
        //非数字的都去掉
        date = date.replaceAll("\\D", "");
        if(date.length() != 8) return null;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<4;i++) {//年
            sb.append(upper[Integer.parseInt(date.substring(i, i+1))]);
        }
        sb.append("年");//拼接年
        int month = Integer.parseInt(date.substring(4, 6));
        if(month <= 10) {
            sb.append(upper[month]);
        } else {
            sb.append("十").append(upper[month%10]);
        }
        sb.append("月");//拼接月

        int day = Integer.parseInt(date.substring(6));
        if (day <= 10) {
            sb.append(upper[day]);
        } else if(day < 20) {
            sb.append("十").append(upper[day % 10]);
        } else {
            sb.append(upper[day / 10]).append("十");
            int tmp = day % 10;
            if (tmp != 0) sb.append(upper[tmp]);
        }
        sb.append("日");//拼接日
        return "地球历"+sb.toString();
    }
}
