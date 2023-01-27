package builder;

public class House implements HousePlan {

    private String type;
    private String walls;
    private String doors;
    private String bathrooms;
    private String kitchen;
    private String roof;
    private String windows;
    private String pools;
    private String basement;
    private String garage;
    private String garden;


    @Override
    public void setWalls(String walls) {
        this.walls=walls;
    }

    @Override
    public void setDoors(String doors) {
        this.doors=doors;
    }

    @Override
    public void setBathrooms(String bathrooms) {
        this.bathrooms=bathrooms;
    }

    @Override
    public void setKitchen(String kitchen) {
        this.kitchen=kitchen;
    }

    @Override
    public void setRoof(String roof) {
        this.roof=roof;
    }

    @Override
    public void setWindows(String windows) {
        this.windows=windows;
    }

    @Override
    public void setPools(String pools) {
        this.pools=pools;
    }

    @Override
    public void setBasement(String basement) {
        this.basement=basement;
    }

    @Override
    public void setGarage(String garage) {
        this.garage=garage;
    }

    @Override
    public void setGarden(String garden) {
        this.garden=garden;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type +"\n"+
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", bathrooms='" + bathrooms + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", pools='" + pools + '\'' +
                ", basement='" + basement + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                '}';
    }
}
