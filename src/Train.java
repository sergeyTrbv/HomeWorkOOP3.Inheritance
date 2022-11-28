import java.sql.Time;

public class Train extends Transport {

    private double priceOfTrip;
    private int travelTime;
    private String stationDeparture;
    private String finalStop;
    private int wagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, double priceOfTrip, int travelTime,
                 String stationDeparture, String finalStop, int wagons) {
        super(brand, model, year, country, color, maxSpeed);
        this.priceOfTrip = priceOfTrip <= 0 ? priceOfTrip : 100d;
        this.travelTime = travelTime <= 0 ? travelTime : 100;
        this.stationDeparture = validOrDefault(stationDeparture, "~noName station~");
        this.finalStop = validOrDefault(finalStop, "~noName finalStopstation~");
        this.wagons = wagons <= 0 ? wagons : 2;
    }

    @Override
    public String toString() {
        return "Train {Бренд: " + brand + ". Модель: " + model + ". Цвет: " + color + ". Макс.скорость: " + maxSpeed + ". Цена поездки: " + priceOfTrip +
                ". Время поездки: " + travelTime + ".\n Станция отбытия: " + stationDeparture + ". Станция прибытия: " + finalStop + ". Кол-во вагонов" + wagons;
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправлять дизелем");
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
}
