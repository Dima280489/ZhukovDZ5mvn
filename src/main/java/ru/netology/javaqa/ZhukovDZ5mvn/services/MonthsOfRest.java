package ru.netology.javaqa.ZhukovDZ5mvn.services;

public class MonthsOfRest {
    public int calcMonth(int income, int expenses, int threshold) {
        int cholidayMonthCounter = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету в конце месяца
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // если количество денег меньше минимальной суммы то
                cholidayMonthCounter++; // увеличиваем счётчик месяцев отдыха +1
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return cholidayMonthCounter;
    }
}
