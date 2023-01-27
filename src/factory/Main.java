package factory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        System.out.println("Here's a :" + shape1.getClass());
        shape1.draw();
        System.out.println();

        Shape shape2 = shapeFactory.getShape("Square");
        System.out.println("Here's a :" + shape2.getClass());
        shape2.draw();
        System.out.println();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        System.out.println("Here's a :" + shape2.getClass());
        shape3.draw();
        System.out.println();
}}
