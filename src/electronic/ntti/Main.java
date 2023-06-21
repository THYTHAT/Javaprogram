package electronic.ntti;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        circle Circle =new circle();

        System.out.println("" + Circle.getRadius());
        System.out.println(Circle.getColor());
        System.out.println(""+Circle.getArea());

        circle Circle2 = new circle(5.5,"Blue");

        System.out.println(""+Circle2.getRadius());
        System.out.println(""+Circle2.getArea());
        System.out.println(Circle2.getColor());

        circle Circle3 =new circle(12.5,"Yellow");

        System.out.println(""+Circle3.getRadius());
        System.out.println(""+Circle3.getArea());
        System.out.println(Circle3.getColor());

    }


}