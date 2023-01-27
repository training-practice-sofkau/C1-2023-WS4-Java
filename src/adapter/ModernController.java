package adapter;

public class ModernController {
    private double analogDirection;
    private double analogLTrigger;
    private double analogRTrigger;
    private boolean x;
    private boolean y;
    private boolean b;
    private boolean a;

    public ModernController(double analogDirection, double analogLTrigger, double analogRTrigger, boolean x, boolean y, boolean b, boolean a) {
        this.analogDirection = analogDirection;
        this.analogLTrigger = analogLTrigger;
        this.analogRTrigger = analogRTrigger;
        this.x = x;
        this.y = y;
        this.b = b;
        this.a = a;
    }

    public void getAnaloginput() {
        System.out.println("\nLeft trigger: " + this.analogLTrigger);
        System.out.println("Right trigger: " + this.analogRTrigger);
        System.out.println("Direction: " + this.analogDirection);
        System.out.println("A: " + this.a);
        System.out.println("B: " + this.b);
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

    public double getAnalogDirection() {
        return analogDirection;
    }

    public void setAnalogDirection(double analogDirection) {
        this.analogDirection = analogDirection;
    }

    public double getAnalogLTrigger() {
        return analogLTrigger;
    }

    public void setAnalogLTrigger(double analogLTrigger) {
        this.analogLTrigger = analogLTrigger;
    }

    public double getAnalogRTrigger() {
        return analogRTrigger;
    }

    public void setAnalogRTrigger(double analogRTrigger) {
        this.analogRTrigger = analogRTrigger;
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
