package builder;

public class Builder {

    public static void main(String[] args) {

        HouseBuilder builder = new HouseBuilder();
        //No problems with nulls
        builder.buildBathroom(2);
        builder.buildPool(1);
        builder.buildGarage(2);
        builder.buildRooms(3);

        House house1 = builder.build();
        System.out.println(house1);

        builder.buildPool(2);
        House house2 = builder.build();
        System.out.println(house2);

    }
}
