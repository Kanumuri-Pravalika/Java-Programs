abstract class Shape {
    abstract void area();
}

class circle extends Shape {
    double radius;

    public circle(double r) {
        radius = r;
    }

    public void area() {
        double ar = Math.PI * radius * radius;
        System.out.println("Area of circle:" + ar);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new circle(5.0);
        s.area();
    }
}