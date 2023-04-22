import java.util.Scanner;
//Создайте класс, стартовую точку, где через Scanner вы будете получать целое
//число и трансформировать его в двоичную систему (выводить на экран)

public class Homework_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int a = sc.nextInt();
        System.out.println("Вы ввели число: " + a);
        System.out.println("Ваше число в двоичной системе: " + Integer.toBinaryString(a));
        sc.close();
    }
}
