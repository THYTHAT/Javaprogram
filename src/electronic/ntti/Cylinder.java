package electronic.ntti;

public class Cylinder extends circle{
    private double height=1.0;
    public Cylinder(){
     super(2.0);
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double r,double height){
        super(r);
        this.height=height;
    }

    public Cylinder(double r, String c, double height) {
        super(r, c);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
