package factory;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle created");
    }
}
