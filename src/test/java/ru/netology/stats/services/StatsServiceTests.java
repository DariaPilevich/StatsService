package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.services.StatsService;

public class StatsServiceTests {
    @Test
    public void CountSumSales() {
        StatsService service = new StatsService();
        long[] sales = {1, 4, 3, 10, 4, 8};
        long ExpectedSum = 30;
        long ActualSum = service.calcSum(sales);

        Assertions.assertEquals(ExpectedSum, ActualSum);
    }

    @Test
    public void CountAverage() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5, 6};
        double ExpectedAvr = 3.5;
        double ActualAvr = service.calcAverage(sales);

        Assertions.assertEquals(ExpectedAvr, ActualAvr);
    }

    @Test
    public void MaxSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 7, 4, 5, 6};
        long ExpectedMonth = 4;
        long ActualMonth = service.maxSaleMonth(sales);

        Assertions.assertEquals(ExpectedMonth, ActualMonth);
    }

    @Test
    public void MinSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {2, 3, 7, 1, 4, 5, 6};
        long ExpectedMonth = 4;
        long ActualMonth = service.minSaleMonth(sales);

        Assertions.assertEquals(ExpectedMonth, ActualMonth);
    }

    @Test
    public void MonthUnderAvr() {
        StatsService service = new StatsService();
        long[] sales = {2, 3, 9, 4, 5, 6, 7};
        long ExpectedMonth = 4;
        long ActualMonth = service.monthUnderAvr(sales);

        Assertions.assertEquals(ExpectedMonth, ActualMonth);
    }

    @Test
    public void MonthOverAvr() {
        StatsService service = new StatsService();
        long[] sales = {2, 3, 9, 4, 5, 6, 7};
        long ExpectedMonth = 3;
        long ActualMonth = service.monthOverAvr(sales);

        Assertions.assertEquals(ExpectedMonth, ActualMonth);
    }


}
