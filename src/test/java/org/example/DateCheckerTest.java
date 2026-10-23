package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
   private final DateChecker dateChecker = new DateChecker();

   @Test
    public void testJanuaryHas31Days() {
       assertTrue(dateChecker.has31Days(Month.JANUARY), "January should have 31 days");
   }
}
