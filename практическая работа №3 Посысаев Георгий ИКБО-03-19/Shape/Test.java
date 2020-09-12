package Mirea.java.practice3.page1;

public class Test {

    public static void main(String[] args) {

        System.out.println("----------------------------");
        Shape s1 = new Circle("RED", false, 5.5); // Upcast приводим тип класса наследника к классу родителя
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // метода getRadius нет в классе Shape

        System.out.println("----------------------------");
        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // нельзя создать экземпляр абстрактого класса Shape

        System.out.println("----------------------------");
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // метода getLength нет в классе Shape

        System.out.println("----------------------------");
        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println("----------------------------");
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // метода getSide нет в классе Shape

        System.out.println("----------------------------");
        Rectangle r2 = (Rectangle) s4; // downcast
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // метода getSide нет в классе Rectangle
        System.out.println(r2.getLength());

        System.out.println("----------------------------");
        Square sq1 = (Square) r2; // Downcast
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength()); 
    }

}
