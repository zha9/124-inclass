import java.lang.Math;
abstract class Shape {
    abstract void info();
}

class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double x) {
        radius = x;
        area = Math.PI * (2 * radius);
    }

    @Override
    void info() {
        System.out.println("Shape = Circle");
        System.out.println("Radius = " + radius + "cm");
        System.out.println("Area = " + area + "cm^2");
    }
}

class Triangle extends Shape {
    private double width;
    private double height;
    private double area;
    private double hypo;

    public Triangle(double x, double y) {
        width = x;
        height = y;
        area = (width * height) / 2;
        hypo = Math.hypot(width, height);
    }

    @Override
    void info() {
        System.out.println("Shape = Right Triangle");
        System.out.println("Width = " + width + "cm");
        System.out.println("Height = " + height + "cm");
        System.out.println("Area = " + area + "cm^2");
        System.out.println("Hypotenuse = " + hypo + "cm");
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    private double area;

    public Rectangle(double x, double y) {
        width = x;
        height = y;
        area = (width * height);
    }

    @Override
    void info() {
        System.out.println("Shape = Rectangle");
        System.out.println("Width = " + width + "cm");
        System.out.println("Height = " + height + "cm");
        System.out.println("Area = " + area + "cm^2");
    }
}