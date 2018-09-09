package com.gojiholdings.datatypeconversion;


import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static java.time.ZoneOffset.UTC;

public class ZonedDateTimeDatatypeConverter {

    private static final DateTimeFormatter DEFAULT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(UTC);

    private static final List<DateTimeFormatter> FORMATTERS = Arrays.asList(
        DEFAULT_FORMAT,
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withZone(UTC),
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX"),
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssz"),
        DateTimeFormatter.ISO_DATE_TIME,
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX")
    );

    public static ZonedDateTime parseDateTime(String raw) {
        for (DateTimeFormatter formatter : FORMATTERS) {
            try {
                return ZonedDateTime.from(formatter.parse(raw));
            }
            catch (DateTimeException e) { }
        }

        throw new IllegalArgumentException(String.format("Date format not accepted for date=%s", raw));
    }

    public static String printDateTime(ZonedDateTime dateTime) {
        return DEFAULT_FORMAT.format(dateTime);
    }

}
