package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circe = factory.getShape("Circle");
        circe.draw();
        Shape triangle = factory.getShape("Triangle");
        triangle.draw();
        Shape square = factory.getShape("Square");
        square.draw();
        factory.getShape("Cube");

    }
}
