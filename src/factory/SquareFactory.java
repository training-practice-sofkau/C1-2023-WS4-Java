package factory;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape createShape(String side) {

        return new Square(side);
    }
}