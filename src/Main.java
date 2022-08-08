public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задача 2
        long clientDeviceYear = 2015L;
        int clientOS1 = 0;
        if (clientOS1 == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        long clientDeviceYear2 = 2020L;
        int clientOS2 = 1;
        if (clientOS2 == 1 && clientDeviceYear2 <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Аndroid по ссылке");
        }

        //задача5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Хорошо иметь в декабре осень, но лучше вечная весна!");

        }
        // задача 3
        var yearX = 2021;
        if (yearX % 4 == 0 && yearX % 100 != 0 || yearX % 400 == 0) {
            System.out.println(yearX  +  "Год считать високосным");
        } else {
            System.out.println(yearX  +  "Год не считается високосным");
        }
    }
}