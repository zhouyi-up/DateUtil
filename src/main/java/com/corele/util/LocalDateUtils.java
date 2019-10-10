package com.corele.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author liujun
 */
public class LocalDateUtils {

    /**
     * 字符串转换实体
     * @param dateStr
     * @param pattern
     * @return
     */
    public static LocalDate parse(String dateStr,String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, dateTimeFormatter);
    }

    /**
     * 格式化日期为字符串
     * @param localDate
     * @param pattern
     * @return
     */
    public static String format(LocalDate localDate,String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(localDate);
    }
}
