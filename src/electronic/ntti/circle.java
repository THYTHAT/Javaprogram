package electronic.ntti;

public class circle {
    private double radius= 1.0;
    private String color= "Red";

    public circle(){

    }
    public circle(double r){
        radius= r;
    }
    public circle(double r,String c){
        color =c;
        radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "circle[r="+radius+",c="+color+"]";
    }
 }
