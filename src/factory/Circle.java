package factory;

public class Circle implements Shape{
    String radius;

    public Circle (String radius){
        this.radius = radius;
        draw(this.radius);
    }
    @Override
    public void draw(String radius) {
        System.out.println("I draw a Circle with radius: " + this.radius);
    }
}
