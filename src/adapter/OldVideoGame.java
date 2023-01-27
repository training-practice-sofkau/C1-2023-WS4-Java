package adapter;

public class OldVideoGame implements ControllableOld {

    private String name;

    public OldVideoGame(String name) {
        this.name = name;
    }


    @Override
    public Character walk(Character c) {
        return c;
    }

    @Override
    public Character jump(Character c) {
        return c;
    }

    @Override
    public Character fight(Character c) {
        return c;
    }
}
