package builder;

public class Director {
    public void buildExpensiveHouse(Builder houseBuilder){
        houseBuilder.setDoor(3);
        houseBuilder.setRooms(5);
        houseBuilder.setBathrooms(4);
        houseBuilder.setPool(true);
        houseBuilder.setGarden(Garden.BBQ);
        houseBuilder.setGarage(Garage.Big);
    }
    public void buildMediumHouse(Builder houseBuilder){
        houseBuilder.setDoor(2);
        houseBuilder.setRooms(3);
        houseBuilder.setBathrooms(3);
        houseBuilder.setPool(true);
        houseBuilder.setGarden(Garden.BBQ);
        houseBuilder.setGarage(Garage.Small);
    }
    public void buildCheapHouse(Builder houseBuilder){
        houseBuilder.setDoor(1);
        houseBuilder.setRooms(3);
        houseBuilder.setBathrooms(2);
        houseBuilder.setPool(false);
        houseBuilder.setGarden(Garden.Grass);
        houseBuilder.setGarage(Garage.Small);
    }
}
