package builder.HousesTypes;

import builder.House;
import builder.HouseBuilder;

public class SmallHouseBuilder implements HouseBuilder {

    private final House house;

    public SmallHouseBuilder() {
        this.house = new House();
        this.house.setType("Small house");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Wood walls");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Wooden doors");
    }

    @Override
    public void buildBathrooms() {
        house.setBathrooms("1 bathrooms");
    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Small kitchen");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roof");
    }

    @Override
    public void buildWindows() {
        house.setWindows("low quality glass");
    }

    @Override
    public void buildPools() {
        house.setPools("No pool");
    }

    @Override
    public void buildBasement() {
        house.setBasement("No Basement");
    }

    @Override
    public void buildGarage() {
        house.setGarage("No garage");
    }

    @Override
    public void buildGarden() {
        house.setGarden("No garden");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
