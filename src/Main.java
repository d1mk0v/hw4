import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
            if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }
            if (age < 18){
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершенолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        double temperature = 5.7;
                if (temperature <= 5){
                    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
                }
                if (temperature > 5){
                    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        double speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        else
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
    }
}