package adapter;

public class NesController implements ConsoleController{

    @Override
    public void arrowUp(){
        System.out.print("↑");
    }

    @Override
    public void arrowDown(){
        System.out.print("↓");
    }

    @Override
    public void arrowLeft(){
        System.out.print("←");
    }

    @Override
    public void arrowRight(){
        System.out.print("→");
    }

    @Override
    public void pressA(){
        System.out.print("Action");
    }

    @Override
    public void pressB(){
        System.out.print("Jump");
    }

}
