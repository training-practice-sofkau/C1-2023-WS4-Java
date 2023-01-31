package builder;

public class House {
    Integer numberRooms;
    Integer numberBathrooms;
    Boolean garage;
    Boolean garden;
    Boolean pool;

    public House(HouseBuilder builder) {
        this.numberRooms = builder.numberRooms;
        this.numberBathrooms = builder.numberBathrooms;
        this.garage = builder.garage;
        this.garden = builder.garden;
        this.pool = builder.pool;
    }

    public Integer getNumberRooms() {
        return numberRooms;
    }

    public Integer getNumberBathrooms() {
        return numberBathrooms;
    }

    public Boolean getGarage() {
        return garage;
    }

    public Boolean getGarden() {
        return garden;
    }

    public Boolean getPool() {
        return pool;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberRooms=" + numberRooms +
                ", numberBathrooms=" + numberBathrooms +
                ", garage=" + garage +
                ", garden=" + garden +
                ", pool=" + pool +
                '}';
    }

    public static class HouseBuilder {
        Integer numberRooms;
        Integer numberBathrooms;
        Boolean garage;
        Boolean garden;
        Boolean pool;

        public HouseBuilder(Integer numberRooms, Integer numberBathrooms) {
            this.numberRooms = numberRooms;
            this.numberBathrooms = numberBathrooms;
        }

        public HouseBuilder setGarage(Boolean garage) {
            this.garage = garage;
            return this;
        }

        public HouseBuilder setGarden(Boolean garden) {
            this.garden = garden;
            return this;
        }

        public HouseBuilder setPool(Boolean pool) {
            this.pool = pool;
            return this;
        }

        public House build(){
            return new House(this);
        }

    }

}
