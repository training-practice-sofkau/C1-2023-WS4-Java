package builder;

import builder.HousesTypes.BigHouseBuilder;
import builder.HousesTypes.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {
        HouseBuilder big1 = new BigHouseBuilder();
        HouseBuilder small1 = new SmallHouseBuilder();

        Director builder = new Director(big1);
        Director builder2 = new Director(small1);

        builder.constructHouse();
        builder2.constructHouse();

        House house1 = builder.getHouse();
        House house2 = builder2.getHouse();

        System.out.println(house1);
        System.out.println(house2);
    }
}
