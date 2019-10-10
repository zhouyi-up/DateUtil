package com.corele.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jun
 */
public class LocalDateTimeUtils {

    private final static String BASE_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";

    /**
     * 支付串格式化为时间实体
     * @param dateStr
     * @param pattern
     * @return
     */
    public static LocalDateTime strToLocalDateTime(String dateStr,String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateStr, dateTimeFormatter);
    }

    /**
     * 格式化指定格式
     * @param localDateTime
     * @param pattern
     * @return
     */
    public static String format(LocalDateTime localDateTime,String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(localDateTime);
    }

    /**
     * 添加指定分钟数
     * @param localDateTime
     * @param minute
     * @return
     */
    public static LocalDateTime addMinute(LocalDateTime localDateTime,Integer minute){
        LocalDateTime newLocalDateTime = localDateTime.plusMinutes(minute);
        return newLocalDateTime;
    }

}
