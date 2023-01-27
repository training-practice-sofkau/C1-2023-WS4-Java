package builder;

public class House {
    private int doors;
    private int rooms;
    private int bathrooms;
    private Garage garage;
    private Garden garden;
    private boolean pool;

    public House(int doors, int rooms, int bathrooms, Garage garage, Garden garden, boolean pool) {
        this.doors = doors;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.garage = garage;
        this.garden = garden;
        this.pool = pool;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public Garage getGarage() {
        return garage;
    }

    public Garden getGarden() {
        return garden;
    }

    public boolean isPool() {
        return pool;
    }

    @Override
    public String toString() {
        return "House{ " +
                "doors=" + doors +
                ", rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", garage=" + garage +
                ", garden=" + garden +
                ", pool=" + pool +
                " }";
    }
}
