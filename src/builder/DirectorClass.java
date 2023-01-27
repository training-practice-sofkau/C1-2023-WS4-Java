package builder;

public class DirectorClass {

    public Habitat createSmallHouse(HouseBuilder builder){
        builder.setRooms(2);
        builder.setBathrooms(1);
        builder.setGarden(false);
        builder.setGarage(false);
        builder.setPool(false);
        return builder.build();
    }
    public Habitat createMediumSizeHouse(HouseBuilder builder){
        builder.setRooms(3);
        builder.setBathrooms(2);
        builder.setGarden(false);
        builder.setGarage(true);
        builder.setPool(false);
        return builder.build();
    }
    public Habitat createBigHouse(HouseBuilder builder){
        builder.setRooms(4);
        builder.setBathrooms(4);
        builder.setGarden(true);
        builder.setGarage(true);
        builder.setPool(true);
        return builder.build();
    }
    public Habitat createUltraBigHouse(HouseBuilder builder){
        builder.setRooms(8);
        builder.setBathrooms(5);
        builder.setGarden(true);
        builder.setGarage(true);
        builder.setPool(true);
        return builder.build();
    }

}
