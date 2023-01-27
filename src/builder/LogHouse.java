package builder;

public class LogHouse implements Habitat{
    private final int rooms;
    private final int bathrooms;
    private final boolean garage;
    private final boolean pool;

    public LogHouse(int rooms, int bathrooms, boolean garage, boolean pool) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.garage = garage;
        this.pool = pool;
    }

    public void printHouse() {
        System.out.println("This is the description of the log house");
        System.out.println("Rooms: " + rooms);
        System.out.println("Bathrooms: " + bathrooms);
        System.out.println("Garage: " + garage);
        System.out.println("Pool: " + pool);
    }
}
