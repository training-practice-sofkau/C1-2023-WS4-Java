package factory;

public class ShapeFactory {
    //TO-DO: Define a method that acts as the main factory

    Shape shape;
    private ShapeFactory() {};
    public ShapeFactory(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            this.shape = new Circle();
        }
        if (shape.equalsIgnoreCase("square")){
            this.shape = new Square();
        }
        if (shape.equalsIgnoreCase("rectangle")){
            this.shape = new Rectangle();
        }
        if (shape.equalsIgnoreCase("triangle")) {
            this.shape = new Triangle();
        }
    }
    public void draw(){
        shape.draw();
    }
}
