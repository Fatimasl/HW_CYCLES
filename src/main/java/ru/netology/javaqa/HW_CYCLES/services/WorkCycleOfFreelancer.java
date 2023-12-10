package ru.netology.javaqa.HW_CYCLES.services;

public class WorkCycleOfFreelancer {

    public int MonthsOfRest(int income, int expenses, int threshold) {
        int monthsOfRestValue = 0;
        int freelancersMoney = 0;

        for (int month = 1; month <= 12; month++) {
            if (freelancersMoney < threshold) {
                //фрилансер работает
                freelancersMoney = freelancersMoney + income - expenses;
            } else {
                //фрилансер отдыхает
                monthsOfRestValue++;
                freelancersMoney = (freelancersMoney - expenses) / 3;
            }
        }

        return monthsOfRestValue;
    }
}
