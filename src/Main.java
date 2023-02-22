import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задача 4");
        int result = getDeliveryDaysCount(95);
        System.out.println("Потребуется дней: " + result);
    }

    private static int getDeliveryDaysCount(int distance) {
        int daysCount = 0;
        if (distance > 0) {
            daysCount++;
        }
        if (distance > 20) {
            daysCount++;
        }
        if (distance > 60 && distance <= 100) {
            daysCount++;
        }
        return daysCount;

    }

    private static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        printInformation(1, currentYear);
    }

    private static void printInformation(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        determineLeapYear(2022);
    }

    private static void determineLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}