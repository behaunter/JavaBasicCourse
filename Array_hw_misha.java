package arrayExamples;

import java.util.Arrays;

public class Array_hw_misha {
    public static void main(String[] args) {
        System.out.println("Через for");
        int[] massive = {4, 2, 6, 7, 1, 3, 5, 14, 15};
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < 9 ; i++) {

            System.out.print( massive[i]+ 10 + " ");
        }
        System.out.println( );
        System.out.println("Через while");
        System.out.println(Arrays.toString(massive));
        int i = 0;
        while (i < 9) {

            System.out.print( massive[i]+ 10 + " ");
            i++;
        }

        System.out.println();
        System.out.println("Через do while");
        System.out.println(Arrays.toString(massive));
        int o = 0;
        if (o < 9) {
            do {
                System.out.print(massive[o] + 10 + " ");
                o++;
            } while (o < 9);
        }
    }
}
