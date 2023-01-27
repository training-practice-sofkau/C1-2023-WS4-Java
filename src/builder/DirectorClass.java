package builder;

public class DirectorClass {

    public Habitat createSmallHouse(HouseBuilder builder){
        builder.setRooms(2);
        builder.setBathrooms(1);
        builder.setGarage(false);
        builder.setPool(false);
        return builder.getHouse();
    }
    public Habitat createMediumSizeHouse(HouseBuilder builder){
        builder.setRooms(3);
        builder.setBathrooms(2);
        builder.setGarage(true);
        builder.setPool(false);
        return builder.getHouse();
    }
    public Habitat createBigHouse(HouseBuilder builder){
        builder.setRooms(4);
        builder.setBathrooms(4);
        builder.setGarage(true);
        builder.setPool(true);
        return builder.getHouse();
    }
    public Habitat createUltraBigHouse(HouseBuilder builder){
        builder.setRooms(8);
        builder.setBathrooms(5);
        builder.setGarage(true);
        builder.setPool(true);
        return builder.getHouse();
    }

}
