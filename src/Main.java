public class Main {
    public static void main(String[] args) {
        { System.out.println("Задание 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }}

        {
            System.out.println("Задание 2");
            int clientOS = 1;
            int deviceYear = 2014;
            if (clientOS == 0 && deviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");}
            else if (clientOS == 0 && deviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else if (clientOS == 1 && deviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");}
            else if (clientOS == 1 && deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        }
        {
            System.out.println("Задание 3");
            int year = 1996;
            if (year >= 1584 && year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                System.out.println(year +" год является високосным");
            } else {
                System.out.println(year +" год не является високосным");
            }
        }

        {
            System.out.println("Задание 4");
            int deliveryDistance = 25;
            int days = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставка не осуществляется!");}
            else if (deliveryDistance > 60){ days= days + 2;}
            else if (deliveryDistance > 20) { days= days + 1;}
            System.out.println("Потребуется дней " +days);
        }

        {
            System.out.println("Задание 5");
            int mouth = 60;
            switch (mouth) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима!");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна!");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето!");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень!");
                    break;
                    default:
                    System.out.println("Месяц введен неверно!");

            }
        }

    }
}