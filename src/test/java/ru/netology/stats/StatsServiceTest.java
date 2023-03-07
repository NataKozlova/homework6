package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldReturnCorrectTotal() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualTotal = service.totalSales(arr);
        int expectedTotal = 180;
        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    void shouldAverage() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        double actual = service.average(arr);
        double expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSale() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxSale(arr);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMinSale() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minSale(arr);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMonths() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.countMonths(arr);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountHighMonths() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.countHighMonths(arr);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
  }