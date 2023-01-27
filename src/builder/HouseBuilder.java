package builder;

public class HouseBuilder {

    private Integer rooms;
    private Integer bathroom;
    private Integer garage;
    private Integer garden;
    private Integer pool;
    private Integer kitchen;


    public House build(){
        return  new House(rooms, bathroom, garage, garden, pool, kitchen);
    }

    //Setters and Getters --> setters are specific attribute builders

    public Integer getKitchen() {
        return kitchen;
    }

    public void buildKitchen(Integer kitchen) {
        this.kitchen = kitchen;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void buildRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void buildBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public Integer getGarage() {
        return garage;
    }

    public void buildGarage(Integer garage) {
        this.garage = garage;
    }

    public Integer getGarden() {
        return garden;
    }

    public void buildGarden(Integer garden) {
        this.garden = garden;
    }

    public Integer getPool() {
        return pool;
    }

    public void buildPool(Integer pool) {
        this.pool = pool;
    }
}
