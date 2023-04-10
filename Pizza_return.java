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
