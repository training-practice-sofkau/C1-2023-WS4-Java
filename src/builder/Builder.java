package builder;

public interface Builder {
    public void setDoor(int number);
    public void setRooms(int number);
    public void setBathrooms(int number);
    public void setGarage(Garage garage);
    public void setGarden(Garden garden);
    public void setPool(Boolean pool);
}
