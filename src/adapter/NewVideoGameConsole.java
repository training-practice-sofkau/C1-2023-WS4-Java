package adapter;

public class NewVideoGameConsole implements ControllableNew {

    private String name;
    private String company;
    private int year;

    public NewVideoGameConsole(String name, String company, int year) {
        this.name = name;
        this.company = company;
        this.year = year;
    }

    @Override
    public String walk(String s) {
        if(s.equalsIgnoreCase("walk")) return "Executing action to walk";

        return "This command is invalid";

    }

    @Override
    public String jump(String s) {
        if(s.equalsIgnoreCase("jump")) return "Executing action to jump";

        return "This command is invalid";
    }

    @Override
    public String fight(String s) {
        if(s.equalsIgnoreCase("fight")) return "Execution action to fight";

        return "This command is invalid";
    }



}
