package builder;

public class House {

    private Integer rooms;
    private Integer bathroom;
    private Integer garage;
    private Integer garden;
    private Integer pool;

    public House(Integer rooms, Integer bathroom, Integer garage, Integer garden, Integer pool) {
        this.rooms = rooms;
        this.bathroom = bathroom;
        this.garage = garage;
        this.garden = garden;
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", bathroom=" + bathroom +
                ", garage=" + garage +
                ", garden=" + garden +
                ", pool=" + pool +
                '}';
    }
}
