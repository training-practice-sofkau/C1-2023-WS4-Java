package builder;



public class Director {

    public House buildSmallFlat(HouseBuilder builder){
        builder.buildRooms(1);
        builder.buildBathroom(1);
        builder.buildKitchen(1);
        return builder.build();
    }

    public House buildBigFlat(HouseBuilder builder){
        builder.buildRooms(4);
        builder.buildBathroom(3);
        builder.buildKitchen(1);
        builder.buildGarage(1);
        return builder.build();
    }

    public House buildMansion(HouseBuilder builder){
        builder.buildGarage(3);
        builder.buildPool(1);
        builder.buildKitchen(1);
        builder.buildBathroom(5);
        builder.buildGarden(3);
        builder.buildRooms(10);
        return builder.build();
    }
}
