package Mirea.java.practice3.page1;

public class Circle extends  Shape {
    protected double radius;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("Круг цвет = %s радиус = %s см ", getColor(), getRadius());
    }
}
