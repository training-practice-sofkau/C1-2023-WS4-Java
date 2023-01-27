package builder;

import builder.House;
import builder.HouseBuilder;

public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildBathrooms();
        this.houseBuilder.buildWalls();
        this.houseBuilder.buildDoors();
        this.houseBuilder.buildKitchen();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildWindows();
        this.houseBuilder.buildPools();
        this.houseBuilder.buildGarage();
        this.houseBuilder.buildGarden();
    }
}
