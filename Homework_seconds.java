package method;

import java.util.Random;

public class Homework_seconds {
    public static void main(String[] args) {
        Random random = new Random();
        int seconds = random.nextInt(0,28801);
        System.out.println("До конца рабочего дня осталось " + seconds + " секунд");
        int hours = seconds / 3600;
        switch (hours){
            case 1 -> System.out.println("До конца рабочего дня остался " + hours + " час");
            case 2,3,4 -> System.out.println("До конца рабочего дня осталось " + hours + " часа");
            case 0,5,6,7,8 -> System.out.println("До конца рабочего дня осталось " + hours + " часов");
        }

    }
}
