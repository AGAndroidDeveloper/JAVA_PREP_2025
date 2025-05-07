package java_2may;

public class Circle {
    private double radius = 0;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

   public double getArea() {
        return radius * radius * Math.PI;
    }

}

//Your code can't run against tests.
//There might be something wrong with syntax usage in your code. You can use error details to fix it.
//src/main/java/com/udemy/ucp/Cylinder.java:6: error: constructor Object in class Object cannot be applied to given types;
//        super(radius);
//        ^
//  required: no arguments
//  found:    double
//  reason: actual and formal argument lists differ in length
//src/main/java/com/udemy/ucp/Cylinder.java:16: error: cannot find symbol
//        return height * getArea();
//                        ^
//  symbol:   method getArea()
//  location: class Cylinder
//2 errors