package builder;

public class BricksHouseBuilder implements HouseBuilder {

    private Habitat house;
    private int rooms;
    private int bathrooms;
    private boolean garage;
    private boolean pool;

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public Habitat getHouse() {
        return new BricksHouse(this.rooms, this.bathrooms, this.garage, this.pool);
    }
}
