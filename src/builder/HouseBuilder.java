package builder;

public interface HouseBuilder {
    HouseBuilder setRooms(int rooms);

    HouseBuilder setBathrooms(int bathrooms);

    HouseBuilder setGarage(boolean garage);

    HouseBuilder setPool(boolean pool);

    HouseBuilder setGarden(boolean garden);

    Habitat build();
}
