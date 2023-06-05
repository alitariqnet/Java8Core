package com.ali.project.Java8Core.miscellaneous;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(LocalDate.of(2015, 02, 20));

        System.out.println(LocalDate.parse("2015-02-20"));

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);
        sixThirty = LocalTime.of(6, 30);
        System.out.println(sixThirty);
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty);

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.parse("2015-02-20T06:30:00"));

        ZoneId zoneId = ZoneId.of("Europe/Paris");

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        allZoneIds.forEach(id->{
            System.out.print(id+", ");
        });
        System.out.println();
        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        System.out.println(zonedDateTime.getOffset());

        System.out.println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));

        ZoneOffset offset = ZoneOffset.of(String.valueOf(zonedDateTime.getOffset()));

        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(localDateTime, offset);

        System.out.println(localDateTime.plusHours(Long.parseLong(String.valueOf(String.valueOf(zonedDateTime.getOffset()).charAt(2)))));
    }
}
