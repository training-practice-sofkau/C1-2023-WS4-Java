package builder.HousesTypes;

import builder.House;
import builder.HouseBuilder;

public class BigHouseBuilder implements HouseBuilder {

    private final House house;

    public BigHouseBuilder() {
        this.house = new House();
        this.house.setType("Big house");
    }


    @Override
    public void buildWalls() {
        house.setWalls("High quality walls");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Wooden doors");
    }

    @Override
    public void buildBathrooms() {
        house.setBathrooms("3 bathrooms");
    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Island kitchen");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Solar panels roof");
    }

    @Override
    public void buildWindows() {
        house.setWindows("High quality glass");
    }

    @Override
    public void buildPools() {
        house.setPools("One pool");
    }

    @Override
    public void buildBasement() {
        house.setBasement("one Basement");
    }

    @Override
    public void buildGarage() {
        house.setGarage("2 garages");
    }

    @Override
    public void buildGarden() {
        house.setGarden("2 gardens");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
