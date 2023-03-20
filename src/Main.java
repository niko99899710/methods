public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printYear1(int yearYears) {
        System.out.println(yearYears + " год является високосным ");
    }
    public static void printYear2(int yearYears2) {
        System.out.println(yearYears2 + " год  не является високосным");
    }


    public static void task1() {
        System.out.println("Задание 1");
        int year = 1998;
        if ( (year % 4 == 0 && year % 100 != 0) ||  (year % 400 == 0)) {
            printYear1(year);
        } if ((year % 400 != 0 && year % 100 != 0) ||  (year % 400 != 0))  {
            printYear2(year);
        }
        }



    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        String clientOs0 = "iOS";
        int clientOs = getClientOS(clientOs0);
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015 && clientOs == 0) {
               System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         } else if (clientDeviceYear > 2015 && clientOs == 0)  {
           System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
          System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (clientDeviceYear > 2015 && clientOs == 1){
          System.out.println("Установите версию приложения для Android по ссылке");
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