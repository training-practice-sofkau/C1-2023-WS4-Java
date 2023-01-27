package factory;

public class RectangleFactory extends ShapeFactory{
    @Override
    public Shape createShape(String side) {

        return new Rectangle(side);
    }
}
