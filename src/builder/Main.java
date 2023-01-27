package builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        System.out.println();
        House bigFlat = director.buildBigFlat(new HouseBuilder());
        System.out.println("Big flat: "+bigFlat);


        System.out.println();
        House smallFlat = director.buildSmallFlat(new HouseBuilder());
        System.out.println("Small flat: "+smallFlat);

        System.out.println();
        House mansion = director.buildMansion(new HouseBuilder());
        System.out.println("Mansion: "+mansion);
    }
}
