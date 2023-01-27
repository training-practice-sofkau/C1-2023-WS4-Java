package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        mainFactory("Circle");
        mainFactory("Triangle");
        mainFactory("Square");
    }


    public static void mainFactory(String name){
            switch (name) {
                case "Circle":
                    Circle c = (Circle) new CircleFactory().createShape();
                    c.draw();

                    break;
                case "Triangle":
                    Triangle t = (Triangle) new TriangleFactory().createShape();
                    t.draw();

                    break;
                case "Square":
                    Square s = (Square) new SquareFactory().createShape();
                    s.draw();


                    break;
            }

    }
}





