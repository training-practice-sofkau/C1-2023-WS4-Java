package builder;

public interface HouseBuilder {
    void setRooms(int rooms);

    void setBathrooms(int bathrooms);

    void setGarage(boolean garage);

    void setPool(boolean pool);

    Habitat getHouse();
}
