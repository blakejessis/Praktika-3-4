public class Circle {
    private final double radius;



    public Circle(){
        radius = 10.0;
    }

    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;

    }
    public double getLength(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args){
        Circle c1 = new Circle(10.0);

        System.out.println("Radius of circle: " + c1.getRadius() + " Length of circle: " + c1.getLength() + " Area of circle: " + c1.getArea());
        Circle c2 = new Circle();
        System.out.println("Radius of circle: " + c2.getRadius() + " Length of circle: " + c2.getLength() + " Area of circle: " + c2.getArea());
    }
}

