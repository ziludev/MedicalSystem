package com.secondgroup.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: alex
 * @date: 2020/5/29 9:15 上午
 */

public class DateTimeConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
