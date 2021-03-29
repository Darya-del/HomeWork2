package com.company;

public class Main {

    public static void main(String[] args) {

        int yearOfBirthday = 1993;
        int monthOfBirthday = 2;
        int dayOfBirthday = 1;
        int sum = yearOfBirthday+monthOfBirthday+dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения:" + sum);

        boolean monthBiggerDay = false;
        if (monthOfBirthday>dayOfBirthday){
            System.out.println("Месяц моего рождения больше даты рождения:"+monthBiggerDay);
        }
        char [] name = {'D','a','r','y','a'};
        System.out.print("Массив с моим именем:");
        for (char item : name) {
            System.out.print(item+ "");
        }

        System.out.println("");
        double myAge = 28.0;
        double partYear = 2.0/12.0;
        myAge = myAge + partYear;
        System.out.println("Мне "+ myAge + " лет");

    }
}
