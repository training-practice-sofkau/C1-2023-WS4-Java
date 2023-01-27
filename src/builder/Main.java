package builder;

public class Main {

    public static void main(String[] args) {

        Director dir = new Director();

        System.out.println();
        House bigFlat = dir.buildBigFlat(new HouseBuilder());
        System.out.println("Big flat: "+bigFlat);


        System.out.println();
        House smallFlat = dir.buildSmallFlat(new HouseBuilder());
        System.out.println("Small flat: "+smallFlat);

        System.out.println();
        House mansion = dir.buildMansion(new HouseBuilder());
        System.out.println("Mansion: "+mansion);




    }
}
