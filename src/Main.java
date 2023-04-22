import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        double age = 65.5;
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
    public static void task5() {
        System.out.println("Задача 5");
        double age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        }
        if (age >=5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standingPlace = wagonCapacity - seatPlace;

        int seatsPassengers = 60;
        int standingPassenger = 30;

        if (seatPlace > seatsPassengers) {
            System.out.println("Осталось еще " + (seatPlace - seatsPassengers) + " сидячих мест");
        } else
            System.out.println("Сидячих мест нет");
        if (standingPlace > standingPassenger){
            System.out.println("Осталось еще " + (standingPlace - standingPassenger) + " стоячих мест");
        } else
            System.out.println("Стоячих мест нет");


    }
}