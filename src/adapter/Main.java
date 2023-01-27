package adapter;

public class Main {
    public static void main(String[] args) {
        NesController nesController = new NesController();
        SegaController segaController = new SegaController();

        ControllerAdapter adapter = new ControllerAdapter();

        cheatCode(nesController);
        cheatCode(segaController);
        cheatCode(adapter);

    }

    public static void cheatCode(ConsoleController controller){
        System.out.println();
        controller.arrowUp();
        controller.arrowDown();
        controller.arrowUp();
        controller.arrowDown();
        controller.arrowLeft();
        controller.arrowRight();
        controller.arrowLeft();
        controller.arrowRight();
        controller.pressB();
        controller.pressA();
    }
}
