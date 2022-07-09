package ru.netology.stats.services;

public class StatsService {
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double calcAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return (double) sum / sales.length;
    }

    public int maxSaleMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSaleMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthUnderAvr(long[] sales) {
        int monthUnderAvr = 0;
        double avr = calcAverage(sales);
        for (long sale : sales) {
            if ((double) sale < avr) {
                monthUnderAvr = monthUnderAvr + 1;
            }
        }
        return monthUnderAvr;
    }

    public int monthOverAvr(long[] sales) {
        int monthOverAvr = 0;
        double avr = calcAverage(sales);
        for (long sale : sales) {
            if ((double) sale > avr) {
                monthOverAvr = monthOverAvr + 1;
            }
        }
        return monthOverAvr;
    }


}

