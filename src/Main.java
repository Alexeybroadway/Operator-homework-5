public class Main {

    public static void main(String[] args) {

        // Задание №1

        System.out.println("Задание №1");
        int yearsOld = 16;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }
        if (yearsOld < 18)  {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }

        // Задание №2

        System.out.println("Задание №2");

        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else if (yearsOld >= 24 && yearsOld < 100) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }

        // Задание 3

        System.out.println("Задание №3");

        int capacity = 102;     // seatsPlace 60, standingPlace 42

        int ourTicket = 103;


        if (ourTicket >= 0 && ourTicket < 61) {
            System.out.println("В вагоне имеются свободные сидячие места ");
        }
        if (ourTicket >= 61 && ourTicket <= 102) {
            System.out.println("В вагоне имеется только стоячие место");
        }
        if (ourTicket > 102) {
            System.out.println("В вагоне отсутствуют места");
        }

        // Часть вторая

        // Задание 1


        System.out.println("Задание №1");
        int yearsOld = 19;
        if (yearsOld >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Вам необходимо подождать");
        }


        // Задание 2


        System.out.println("Задание №2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else if (yearsOld >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }


        // Задание 3


        System.out.println("Задание №3");
        // allPlace = 102;  seatsPlace = 60; standingPlace =  42;
        int ourTicket = 103;
        if (ourTicket >= 0 && ourTicket < 61) {
            System.out.println("В вагоне имеются сидячие места ");
        } else if (ourTicket >= 61 && ourTicket <= 102) {
            System.out.println("В вагоне имеется только стоячие место");
        } else if (ourTicket >= 103) {
            System.out.println("В вагоне отсутствуют места");
        }

        // Задание 3.2

        System.out.println("Задание 3.1");

        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 23;
        int otherUsed = 17;
        if (seatsUsed < seatsCount) {
            System.out.println("В вагоне имеются " + seatsUsed + " сидячих места");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть ещё " + (otherCount - otherUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }
}