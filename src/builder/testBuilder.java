package builder;

public class testBuilder {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        HouseBuilder houseBuilder1 = new HouseBuilder();
        Director director = new Director();
        director.buildExpensiveHouse(houseBuilder);
        System.out.println("\nGenerate new cheap house: " + houseBuilder.getHouse());

        houseBuilder1.setDoor(3);
        houseBuilder1.setRooms(1);
        houseBuilder1.setBathrooms(2);
        houseBuilder1.setPool(false);
        houseBuilder1.setGarden(Garden.Grass);
        houseBuilder1.setGarage(Garage.Big);
        System.out.println("Without the Director class: " + houseBuilder1.getHouse());
    }

}
