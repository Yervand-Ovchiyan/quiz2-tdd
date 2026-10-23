package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.EnumSet;

public class DateChecker {

    private static final Set<Month> MONTHS_WITH_31_DAYS = EnumSet.of(Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER,  Month.DECEMBER);


    public boolean has31Days(Month month) {
       if (month == null) {
           throw new IllegalArgumentException("month cannot be null");
       }
        return MONTHS_WITH_31_DAYS.contains(month);
    }
}
