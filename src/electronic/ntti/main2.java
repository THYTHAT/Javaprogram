package electronic.ntti;

import Animal.Animal;

public class main2 {
    public void main(String[] args) {
        Author auther = new Author("THAT", "thythat@gmail", 'M');
        System.out.println(auther.getName());
        System.out.println(auther.toString());

        //===================
        System.out.println("===========");

        Cylinder cylinder = new Cylinder(4.5);
        System.out.println("height="+cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getRadius());


    }



}
