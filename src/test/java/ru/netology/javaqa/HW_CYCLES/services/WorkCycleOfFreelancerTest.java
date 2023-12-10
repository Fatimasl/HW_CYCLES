package ru.netology.javaqa.HW_CYCLES.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WorkCycleOfFreelancerTest {

    @Test
    void WorkCycleOfFreelancerTest1() {
        WorkCycleOfFreelancer service = new WorkCycleOfFreelancer();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.MonthsOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void WorkCycleOfFreelancerTest2() {
        WorkCycleOfFreelancer service = new WorkCycleOfFreelancer();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.MonthsOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
