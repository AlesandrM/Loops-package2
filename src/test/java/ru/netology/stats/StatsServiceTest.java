package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesCalculation() {
        StatsService service = new StatsService();

        int[] theSumOfAllSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesCalculation(theSumOfAllSales);

        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;


        int actual = service.sum(averageSales);

        assertEquals(expected, actual);


    }


    @Test
    void monthWithMax() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;


        int actual = service.monthWithMax(averageSales);

        assertEquals(expected, actual);

    }

    @Test
    void monthWithMin() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;


        int actual = service.monthWithMin(averageSales);

        assertEquals(expected, actual);
    }

    @Test
    void moreThanAverage() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 0;


        int actual = service.moreThanAverage(averageSales);

        assertEquals(expected, actual);
    }

    @Test
    void lessThanAverage() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;


        int actual = service.lessThanAverage(averageSales);

        assertEquals(expected, actual);
    }
}