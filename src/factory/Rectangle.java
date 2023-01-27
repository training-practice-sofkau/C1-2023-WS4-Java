package factory;

public class Rectangle implements Shape {
    String side;

    public Rectangle(String side){
        this.side = side;
        draw(this.side);
    }

    @Override
    public void draw(String side) {
        System.out.println("I draw a Rectangle and one of its sides is: " + this.side);
    }
}
