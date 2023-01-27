package adapter;

public class Main {

    public static void main(String[] args) {


        NewVideoGameConsole Nintendo = new NewVideoGameConsole("Switch","Nintendo",2023);

        OldVideoGame superMario = new OldVideoGame("Super Mario 2");


        System.out.println("Commands old generations");
        System.out.println("Walk: "+superMario.fight('f'));
        System.out.println("Jump: "+superMario.jump('j'));
        System.out.println("Fight: "+superMario.walk('w'));

        /*
        Nintendo.fight(superMario.fight('f'));
        Nintendo.jum(superMario.jum('j'));
        Nintendo.walk(superMario.walk('w'));
        */

        VideoGameAdapter vdAdapter = new VideoGameAdapter();

        System.out.println("Commands in new generation");
        System.out.println("Walk: "+Nintendo.walk(vdAdapter.walk(superMario.walk('w'))));
        System.out.println("Jump: "+Nintendo.jump(vdAdapter.jump(superMario.jump('j'))));
        System.out.println("Fight: "+Nintendo.fight(vdAdapter.fight(superMario.fight('f'))));




    }

}
