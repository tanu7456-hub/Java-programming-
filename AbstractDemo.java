// practical 5 : abstract class and calculate the area of differetn shapes.
abstract class Shape {
    abstract void area();   // abstract method
}

class Circle extends Shape {
    void area() {
        double r = 5;
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    void area() {
        int length = 10;
        int breadth = 5;
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Triangle extends Shape {
    void area() {
        int base = 8;
        int height = 6;
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Shape s;   // reference of abstract class

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
