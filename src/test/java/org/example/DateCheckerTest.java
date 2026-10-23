package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class DateCheckerTest {

    private final DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(Month.JANUARY), "January should have 31 days");
    }

    @Test
    public void testAprilDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(Month.APRIL), "April should not have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void testMonthHas31Days(Month month) {
        assertTrue(dateChecker.has31Days(month), month +"Month should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testMonthWith30Days(Month month) {
        assertFalse(dateChecker.has31Days(month), month +"Month should  not have 31 days");
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
     assertFalse(dateChecker.has31Days((Month.FEBRUARY)), "February should not have 31 days");
    }
    @Test
    public void testNullMonthThrowsException() {
        assertThrows(IllegalAccessError.class, () -> dateChecker.has31Days(null), "a null month should throw IllegalArgumentException" );
    }
}