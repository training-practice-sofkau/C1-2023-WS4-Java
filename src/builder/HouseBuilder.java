package builder;

public class HouseBuilder implements Builder {
    private int doors;
    private int rooms;
    private int bathrooms;
    private Garage garage;
    private Garden garden;
    private boolean pool;

    public HouseBuilder(){

    }

    @Override
    public void setDoor(int number) {
        this.doors = number;
    }

    @Override
    public void setRooms(int number) {
        this.rooms = number;
    }

    @Override
    public void setBathrooms(int number) {
        this.bathrooms = number;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public void setPool(Boolean pool) {
        this.pool = pool;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public House getHouse(){
        return new House(this.doors,this.rooms,this.bathrooms,this.garage,this.garden,this.pool);
    }
}
