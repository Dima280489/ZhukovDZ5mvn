package ru.netology.javaqa.ZhukovDZ5mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfRestTest {

    //    @Test
//    public void testMonthOfRest() {
//        MonthsOfRest service = new MonthsOfRest();
//
//        int expected = 3;
//        int actual = service.calcMonth(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000",
            "100000,60000,150000"
    })
    public void testMonthOfRest(int income, int expenses, int threshold) {
        MonthsOfRest service = new MonthsOfRest();
        int actual = service.calcMonth(income, expenses, threshold);
    }
}

