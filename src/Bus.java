public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправлять бензином или дизелем на заправке");
    }
}
