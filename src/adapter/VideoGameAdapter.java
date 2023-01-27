package adapter;

public class VideoGameAdapter implements ControllableOldToNew {



    @Override
    public String walk(Character c) {
        if (c=='w') return "walk";

        return "This command is invalid";
    }

    @Override
    public String jump(Character c) {
        if (c=='j') return "jump";

        return "This command is invalid";
    }

    @Override
    public String fight(Character c) {
        if (c=='f') return "fight";
        return "This command is invalid";
    }
}
