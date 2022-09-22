public class Main {

    //Метод для задачи-1.
    public static boolean calculateLeapYear (int year) {
        boolean calculateLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return calculateLeapYear;
    }
    //Метод для задачи-2.
    private static String calculateOs(int clientOS) {
        String osName0 = "iOS";
        String osName1 = "Android";

        if (clientOS == 0) {
            return osName0;
        }else {
            return osName1;
        }
    }
    //Метод для задачи-2.
    private static String calculateVersion(int clientDeviceYear) {
        String version = "версию";
        String liteVersion = "облегченную версию";

        if (clientDeviceYear < 2015) {
            return liteVersion;
        }else {
            return version;
        }
    }
    //Метод для задачи-3.
    public static int calculateDeliveryDistance (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            return deliveryDays;
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            return deliveryDays * 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return deliveryDays * 3;
        }
        return deliveryDays;
    }
    public static void main(String[] args) {

        //Задание-1.
        System.out.println("Задание-1.");

        int year = 2020;

        if (calculateLeapYear(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание-2.
        System.out.println("Задание-2.");

        int clientOS = 1;
        int clientDeviceYear = 2014;

        System.out.println("Установите " + calculateVersion(clientDeviceYear) + " приложения для " + calculateOs(clientOS) + " по ссылке.");

        //Задание-3.
        System.out.println("Задание-3.");

        int deliveryDistance = 70;

        System.out.println("Потребуется дней: " + calculateDeliveryDistance (deliveryDistance));
    }
}