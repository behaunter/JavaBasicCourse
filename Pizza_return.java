public class Pizza_return {
    double cal_quan = 0;

    public Pizza_return(double diametr) {
        double result1 = pow(diametr);
        double result2 = div(result1);
        double result3 = mult(result2);
        double result4 = cal(result3);

        cal_quan = result4;
    }

    public double pow(double d) {
        double result = Math.pow(d, 2);

        return result;
    }

    public double div(double q) {
        double result = q / 4;
        return result;
    }


    public double mult(double w) {
        double result = w * Math.PI;
        return result;

    }

    public double cal(double e) {
        double result = e * 40;
        return result;


    }




}

// Launching of the programm
// public class Pizza_One {
//     public static void main(String[] args) {

//         Pizza_return pizza1 = new Pizza_return(24);
//         Pizza_return pizza2 = new Pizza_return(28);
//         System.out.println("Разница каллорий = " + (pizza2.cal_quan - pizza1.cal_quan));


//     }
// }
