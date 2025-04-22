import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        checkYearAndPrint(scanner.nextInt());

        System.out.println("Task 2: ");
        System.out.println("Введите, какая у вас операционная система (0 — iOS, 1 — Android): ");
        int clientOS = scanner.nextInt();
        System.out.println("Введите год выпуска вашей модели: ");
        int yearOfReleaseDevice = scanner.nextInt();
        checkOSAndYear(clientOS, yearOfReleaseDevice);

        System.out.println("Task 3: ");
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
        int daysDelivery = checkDistance(deliveryDistance);
        if (daysDelivery > 0) {
            System.out.println("Потребуется дней: " + checkDistance(deliveryDistance));
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }
    }

    public static void checkYearAndPrint(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void checkOSAndYear(int number, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year >= currentYear && number == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (year >= currentYear && number == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (year < currentYear && number == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (year < currentYear && number == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (number != 1 && number != 0) {
            System.out.println("Не определена операционная система.");
        }
    }

    public static byte checkDistance(int distance) {
//        int daysDelivery;
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}
