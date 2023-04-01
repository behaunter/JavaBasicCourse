public class Homework_chartoInt {
    public static void main(String[] args) {
        // 1 способ - Char to Int из таблицы ASCII
        char q = '9';
        System.out.println("Символ "+ q + " = " + (int)q);

        // 2 способ - valueof () class string

        char w = '9' ;

        int wi = Integer.parseInt(String.valueOf(w));
        System.out.println("Преобразуем char из " + w +" в int " + wi );

        // 3 cпособ - использование метода getNumericValue () класса символов
        char o = '9';
        int eINT =  Character.getNumericValue(o);
        System.out.println("Преобразуем char из " + o +" в int " + eINT );
    }
}
