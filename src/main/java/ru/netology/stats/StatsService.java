package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public double average(int[] sales) {
        double total = totalSales(sales);
        double average = total / sales.length;
        return average;

    }
    public int maxSale(int[] sales) {
        int month = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                month = i + 1;
            }
        }
        return month;
    }
    public int minSale(int[] sales) {
        int month = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                month = i + 1;
            }
        }
        return month;
    }
    public int countMonths(int[] sales) {
        int months = 0;
        double average = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
               months++;
            }
        }
        return months;
    }
    public int countHighMonths(int[] sales) {
        int months = 0;
        double average = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months++;
            }
        }
        return months;
    }
}

