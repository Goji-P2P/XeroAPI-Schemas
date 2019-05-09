package com.gojiholdings.datatypeconversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTypeConverter {

    public static LocalDate parseLocalDate(String date){
        return DateTimeFormatter.ISO_LOCAL_DATE.parse(date, LocalDate::from);
    }

    public static String printLocalDate(LocalDate date){
        return DateTimeFormatter.ISO_LOCAL_DATE.format(date);
    }
}
