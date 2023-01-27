package factory;

public class CircleFactory extends ShapeFactory{

    @Override
    public Shape createShape(String radius) {

        return new Circle(radius);
    }
}
