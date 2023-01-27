package builder;

public class BricksHouse extends Habitat {

    public BricksHouse(int rooms, int bathrooms, boolean garage, boolean pool, boolean garden) {
        super(rooms, bathrooms, garage, pool, garden);
    }

    public void printHouse() {
        System.out.println("\nThis is the description of the bricks house");
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Bathrooms: " + this.bathrooms);
        System.out.println("Garden: " + this.garden);
        System.out.println("Garage: " + this.garage);
        System.out.println("Pool: " + this.pool + "\n");
    }
}
