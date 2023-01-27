package builder;

public class LogCabinBuilder implements HouseBuilder {

    private int rooms;
    private int bathrooms;
    private boolean garage;
    private boolean garden;
    private boolean pool;

    @Override
    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public HouseBuilder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }
    @Override
    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    @Override
    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public HouseBuilder setPool(boolean pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public Habitat build() {
        return new LogCabin(this.rooms, this.bathrooms, this.garage, this.pool, this.garden);
    }
}
