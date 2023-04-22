import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
    public static void  task4() {
        System.out.println("Задача 4");
        double age = 65;
        if (age < 2){
            System.out.println("Если возраст человека равен " + age + ", то ему надо идти спать");
        }
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        if (age > 60) {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }
}