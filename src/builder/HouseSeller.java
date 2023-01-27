package builder;

public class HouseSeller {
    public static void main(String[] args) {
        DirectorClass director = new DirectorClass();
        HouseBuilder brickBuilder = new BricksHouseBuilder();
        HouseBuilder logBuilder = new LogCabinBuilder();

        Habitat smallHabitat = director.createSmallHouse(brickBuilder);
        Habitat bigHabitat = director.createBigHouse(logBuilder);

        System.out.println("This is the smallHabitat's "+smallHabitat.getClass());
        //System.out.println(smallHabitat);
        smallHabitat.printHouse();
        System.out.println("This is the bigHabitat's "+bigHabitat.getClass());
        //System.out.println(bigHabitat);
        bigHabitat.printHouse();

        brickBuilder.setRooms(9).setBathrooms(1).setGarden(true).setGarage(false).setPool(true);
        Habitat hotel = brickBuilder.build();

        System.out.println("This is the hotel's "+hotel.getClass());
        //System.out.println(hotel);
        hotel.printHouse();

    }
}
