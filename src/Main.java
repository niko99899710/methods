import java.time.LocalDate;

import static java.time.LocalDate.now;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
          public static void task1() {
              System.out.println("Задание 1");
              int year = 2017;
              printYear1(year);
          }

    public static void printYear1(int year) {
        if ( (year % 4 == 0 && year % 100 != 0) ||  (year % 400 == 0)) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год  не является високосным");

        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        getClientOS(1, 2016);
       }

    public static void getClientOS(int ios, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (ios == 0) {
            if (clientOs < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOs == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (ios == 1) {
            if (clientOs < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            if (clientOs == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

       public static int countDate (int deliveryDistance) {
           if (deliveryDistance < 0) {
               return -1;
           } else if (deliveryDistance <= 20){
               return 1;
           } else if (deliveryDistance <= 60) {
               return 2;
           } else if (deliveryDistance <= 100) {
               return 3;
           } else {
               return -1;
           }
       }


    public static void task3 () {
        System.out.println("Задание 3");
        int delivery = countDate( 99);
        if (delivery > 0) {
            System.out.println(delivery + " - Доставка занимает ");
        } else {
            System.out.println(delivery + " - Свыше 100 км доставки нет.");
        }
        }
}