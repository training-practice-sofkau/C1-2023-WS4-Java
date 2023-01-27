package adapter;

public class OlderController {
    private int Direction;
    private int LTrigger;
    private int RTrigger;
    private boolean x;
    private boolean y;
    private boolean b;
    private boolean a;

    public OlderController(int Direction, int LTrigger, int RTrigger, boolean x, boolean y, boolean b, boolean a) {
        this.Direction = Direction;
        this.LTrigger = LTrigger;
        this.RTrigger = RTrigger;
        this.x = x;
        this.y = y;
        this.b = b;
        this.a = a;
    }

    public void getInput() {
        System.out.println("\nLeft trigger: " + this.LTrigger);
        System.out.println("Right trigger: " + this.RTrigger);
        System.out.println("Direction: " + this.Direction);
        System.out.println("A: " + this.a);
        System.out.println("B: " + this.b);
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direction) {
        Direction = direction;
    }

    public int getLTrigger() {
        return LTrigger;
    }

    public void setLTrigger(int LTrigger) {
        this.LTrigger = LTrigger;
    }

    public int getRTrigger() {
        return RTrigger;
    }

    public void setRTrigger(int RTrigger) {
        this.RTrigger = RTrigger;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public boolean isY() {
        return y;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
}
