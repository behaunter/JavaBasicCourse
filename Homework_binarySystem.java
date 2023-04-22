public class Homework_2 {
    public static void main(String[] args) {

        // 637 перевести в двоичную
        // longway
        int a2 = 637;
        System.out.println(a2/2); // 318
        System.out.println(a2%2); // 1

        System.out.println(318/2); //159
        System.out.println(318%2); // 0

        System.out.println(159/2); //79
        System.out.println(159%2); //1

        System.out.println(79/2); //39
        System.out.println(79%2); //1

        System.out.println(39/2); //19
        System.out.println(39%2); //1

        System.out.println(19/2); //9
        System.out.println(19%2); //1

        System.out.println(9/2); //4
        System.out.println(9%2); //1

        System.out.println(4/2); //2
        System.out.println(4%2); //0

        System.out.println(2/2); //1
        System.out.println(2%2); //0

        System.out.println(1/2); //0
        System.out.println(1%2); //1

        System.out.println(0b1001111101);
        //shortway
        System.out.println(Integer.toBinaryString(637));
        System.out.println("Ответ="+1001111101);


        //11100111 перевести в десятиричную
        System.out.println(1*Math.pow(2,7) + 1*Math.pow(2,6) +1*Math.pow(2,5)+1*Math.pow(2,2)+1*Math.pow(2,1)+1*Math.pow(2,0));
        System.out.println(0b11100111);
        System.out.println("Ответ="+231);



        //637 перевести в троичную
        int a3 = 637;
        System.out.println(a3/3); // 212
        System.out.println(a3%3); // 1

        System.out.println(212/3); //70
        System.out.println(212%3); // 2

        System.out.println(70/3); //23
        System.out.println(70%3); //1

        System.out.println(23/3); //7
        System.out.println(23%3); //2

        System.out.println(7/3); //2
        System.out.println(7%3); //1

        System.out.println(2/3); //0
        System.out.println(2%3); //2

        System.out.println("Ответ= " + 212121);

    }
}
