package com.gojiholdings.datatypeconversion;


import java.time.ZonedDateTime;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;

public class ZonedDateTimeDatatypeConverter {

    public static ZonedDateTime parseDateTime(String raw) {
        return ZonedDateTime.from(ISO_DATE_TIME.parse(raw));
    }

    public static String printDateTime(ZonedDateTime dateTime) {
        return ISO_DATE_TIME.format(dateTime);
    }

}
