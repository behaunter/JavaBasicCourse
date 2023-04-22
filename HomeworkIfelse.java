package ifelse;

//:       представьте, что вы разрабатываете алгоритм для кофейного аппарата, в котором есть всего 4 кнопки. Выбор напитков может быть следующий: эспрессо, американо, капучино, чай. При нажатии кнопки, ваш напиток должен приготовиться.
//        Попробуйте отобразить в консоли процесс приготовления напитков, исходя из нажатой кнопки (1-эспрессо, 2-американо, 3-капучино, 4- чай) через if-else и через switch-case.
//        Помимо этого сформируйте и разделите процесс на отдельные методы для их переиспользования, т.к. напитки могут быть разделены на самостоятельные процессы:
//        Эспрессо - неразделимый процесс
//        Американо - эспрессо + добавление воды
//        Капучино - эспрессо + добавление вспененного молока

import java.util.Scanner;

public class HomeworkIfelse {


    public static void main(String[] args) {
        methodsforcofee cup = new methodsforcofee();

        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите напиток (1-эспрессо, 2-американо, 3-капучино, 4- чай): ");
        int drink = sc.nextInt();
        sc.close();


//        switch(drink){
//            case 1 -> System.out.println("Ваш эспрессо готов");
//            case 2 -> System.out.println("Ваш американо готов");
//            case 3 -> System.out.println("Ваш капучино готов");
//            case 4 -> System.out.println("Ваш чай готов");
//            default -> System.out.println("Ошибка. Попробуйте еще раз");
//        }


        if (drink == 1){
            System.out.println("Ваш эспрессо готов");
        } else if (drink == 2) {
            System.out.println("Ваш американо готов");
        } else if (drink == 3) {
            System.out.println("Ваш капучино готов");
        } else if (drink == 4) {
            System.out.println("Ваш чай готов");
        } else {
            System.out.println("Ошибка. Попробуйте еще раз");
        }
    }
}

// я не совсем понял задание по методам, вот мой вариант задачи методов, напишите пожалуйста комментарий, правильно ли я понял вторую часть задания?
//package ifelse;
//
//public class methodsforcofee {
//
//    public void americano (String espresso,String hotwater) {
//        String americano =  espresso + hotwater;
//    }
//    public void cappuchino (String foamMilk,String espresso) {
//        String cappuchino = espresso + foamMilk;
//
//    }
//    public void tea (String hotwater,String leaves) {
//        String tea = hotwater + leaves;
//
//    }
//}
