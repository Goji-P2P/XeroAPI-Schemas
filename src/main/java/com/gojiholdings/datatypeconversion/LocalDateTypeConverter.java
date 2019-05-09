package com.gojiholdings.datatypeconversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTypeConverter {


    /**
     * 2019-05-08T00:00:00 Format from Xero
     * @param date
     * @return
     */
    public static LocalDate parseLocalDate(String date){
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse(date, LocalDate::from);
    }

    public static String printLocalDate(LocalDate date){
        return DateTimeFormatter.ISO_LOCAL_DATE.format(date);
    }
}
