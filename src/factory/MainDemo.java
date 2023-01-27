package factory;

import java.util.Scanner;

public class MainDemo {
    private static ShapeFactory shapeFactory;
    private static String measurement;
    public static void main(String[] args) {
        Scanner shapeType = new Scanner(System.in);
        System.out.println("Enter the type of shape you want to create: ");
        String shape = shapeType.nextLine();
        configure(shape);

        System.out.println("Enter the measurement you want to use with the shape: ");
        String measure = shapeType.nextLine();
        executeCreation(measure);

    }

    static void configure(String shape){
        switch (shape){
            case "Circle":
                shapeFactory = new CircleFactory();
                break;
            case "Rectangle":
                shapeFactory = new RectangleFactory();
                break;
            case "Square":
                shapeFactory = new SquareFactory();
        }
    }

    static void executeCreation (String measure){
        shapeFactory.createShape(measure);
    }
}
