public class Box {


    public int width;
    public int height;
    public int length;

    public Box (int width,int height, int length) {

        int volume = width * height * length;
        System.out.println("Объем коробки равен " + volume );
    }


}
