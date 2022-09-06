public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task8() {
        int a=139;
        int b=a/10%10;
        System.out.println(b);
    }

    private static void task7() {
        int a=5;
        int b=7;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Значение а равно "+ a +" Значение b равно "+ b);
        System.out.println();
    }

    private static void task6() {
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        if (result>=0) {
            result=-result;
            System.out.println( result);
        } else if (result<0) {
            result=Math.abs(result);
            System.out.println( result);
        }
        System.out.println();
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
        System.out.println();
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






