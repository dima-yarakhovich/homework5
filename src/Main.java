public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task5() {
        int monthNumber = 8;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень");
                break;
            default:
                System.out.println(" Такой поры года не существует");
        }
    }

    private static void task4() {
        int deliveryDistance = 95;
         int deliveryDay = 0;
         if (deliveryDistance<=20){
             deliveryDay=1;
             System.out.println(" Потребуется " + deliveryDay+ " день." );
         } else if (deliveryDistance>20 && deliveryDistance<=60) {
             deliveryDay+=2;
             System.out.println(" Потребуется " + deliveryDay+ " дня." );
         }else if (deliveryDistance>60 && deliveryDistance<=100) {
            deliveryDay += 3;
             System.out.println(" Потребуется " + deliveryDay+ " дня." );
        }
        System.out.println();
    }

    private static void task3() {
        int year = 199;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным.");
            }else {
            System.out.println( year + " год не является високосным.");
        }
        System.out.println();
    }

    private static void task2() {
        int clientOs = 0;
        int yers = 2014;
        if (clientOs == 0 && yers >= 2015) {
            System.out.println(" Установите версию приложения для iOs по ссылке.");
        } else if (clientOs == 0 && yers < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOs по ссылке.");
        } else if (clientOs == 1 && yers >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println();
    }


    private static void task1() {
       int clientOS=1;
       if (clientOS==0){
           System.out.println(" Установите версию приложения для iOS по ссылке.");
       }else if (clientOS==1){
           System.out.println(" Установите версию приложения для Android по ссылке.");
       }
        System.out.println();
    }

}






