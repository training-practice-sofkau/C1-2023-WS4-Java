package builder;

public abstract class Habitat {
    protected final int rooms;
    protected final int bathrooms;
    protected final boolean garage;
    protected final boolean garden;
    protected final boolean pool;

    public Habitat(int rooms, int bathrooms, boolean garage, boolean pool, boolean garden) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.garage = garage;
        this.pool = pool;
        this.garden = garden;
    }

    public abstract void printHouse ();
}
