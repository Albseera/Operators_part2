public class Main {
    public static void main(String[] args) {
       //Задание №1
        System.out.println("Задание №1");

        int clientOS=1;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание №2
        System.out.println("Задание №2");

        int clientDeviceYear=2014;
        int clientsOS=1;
        if (clientsOS==0){
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else{
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задание №3
        System.out.println("Задание №3");
        int year=2420;
        int chekYear4= year%4;
        int chekYear100= year%100;
        int chekYear400= year%400;

        if(chekYear4==0||chekYear400==0){

            if(chekYear100!=0){
                System.out.println("Является высокосным");
            }else {
                System.out.println("Является не высокосным");
            }
        }else {
            System.out.println("Является не высокосным");
        }

        //Задание №4
        System.out.println("Задание №4");
        int deliveryDistance=55;
        int deliveryDay=0;

        if(deliveryDistance<=20){
            deliveryDay=1;
        }else if (deliveryDistance>20&&deliveryDistance<60){
            deliveryDay =2;
        }else if (deliveryDistance>=60&&deliveryDistance<100){
            deliveryDay =3;
        }

        System.out.println("Потребуется дней: " + deliveryDay);

        //Задание №5
        System.out.println("Задание №5");
        int monthNumber = 13;
        if (monthNumber<13){
        switch (monthNumber){
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
                System.out.println("Зима");
                break;
            default:
                System.out.println("Некорректно введено число месяца");



        }
        }



    }
}