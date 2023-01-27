package factory;

public class Square implements Shape{
    String side;

    public Square(String side) {
        this.side = side;
        draw(this.side);
    }
    @Override
    public void draw(String side) {System.out.println("I draw a Square and all its sides are " + this.side +"cm long.");}
}
