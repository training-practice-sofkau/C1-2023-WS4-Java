package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape1 = new ShapeFactory("circle");
        ShapeFactory shape2 = new ShapeFactory("square");
        ShapeFactory shape3 = new ShapeFactory("rectangle");
        ShapeFactory shape4 = new ShapeFactory("triangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
    }
}
