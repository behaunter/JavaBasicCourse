public class Box {


    public int width;
    public int height;
    public int length;

    public Box (int width,int height, int length) {

        int volume = width * height * length;
        System.out.println("Объем коробки равен " + volume );
    }


}

//Дальше идет применение конструктора

// public class Homework_constructor {
//     public static void main(String[] args) {

//         Box box1 = new Box(3,4,5);
//     }

// }
