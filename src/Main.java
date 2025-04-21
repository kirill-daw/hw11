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
        byte deliveryDistance = 95;
        checkDistance(deliveryDistance);
        byte daysDelivery = checkDistance(deliveryDistance);
        if (daysDelivery > 0) {
            System.out.println("Потребуется дней: " + daysDelivery);
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }
    }

    public static void checkYearAndPrint(int year) {
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void checkOSAndYear(int number, int Year) {
        int currentYear = LocalDate.now().getYear();
        if (Year >= currentYear && (number == 1 || number == 0)) {
            if (number == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            if (number == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        if (Year < currentYear && (number == 1 || number == 0)) {
            if (number == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            if (number == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        if (number != 1 && number != 0) {
            System.out.println("Не определена операционная система.");
        }
    }

    public static byte checkDistance(byte Distance) {
        byte daysDelivery;
        if (Distance <= 20) {
            daysDelivery = 1;
            return daysDelivery;
        } else if (Distance > 20 && Distance <= 60) {
            daysDelivery = 2;
            return daysDelivery;
        } else if (Distance > 60 && Distance <= 100) {
            daysDelivery = 3;
            return daysDelivery;
        } else {
            daysDelivery = 0;
            return daysDelivery;
        }
    }
}
