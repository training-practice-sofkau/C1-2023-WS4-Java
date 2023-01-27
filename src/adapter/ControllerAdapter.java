package adapter;

public class ControllerAdapter implements ConsoleController{

    public Keyboard keyboard = new Keyboard();

    @Override
    public void arrowUp() {
        keyboard.keyUp();
    }

    @Override
    public void arrowDown() {
        keyboard.keyDown();
    }

    @Override
    public void arrowLeft() {
        keyboard.keyLeft();
    }

    @Override
    public void arrowRight() {
        keyboard.keyRight();
    }

    @Override
    public void pressA() {
        keyboard.click();
    }

    @Override
    public void pressB() {
        keyboard.spaceBar();
    }
}
