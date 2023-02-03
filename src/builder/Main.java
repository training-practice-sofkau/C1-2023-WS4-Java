package builder;

public class Main {
    public static void main (String[] args){
        House house1 = new House.HouseBuilder(3,2).build();
        System.out.println(house1);
        House house2 = new House.HouseBuilder(5,3).setGarden(true).build();
        System.out.println(house2);
        House house3 = new House.HouseBuilder(2,1).setGarden(true).setPool(true).setGarage(true).build();
        System.out.println(house3);

    }
}
