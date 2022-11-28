public abstract class Transport {

    public String brand;
    public String model;
    private final int year;
    private final String country;
    public String color;
    public int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = validOrDefault(brand, "~noName brand~");
        this.model = validOrDefault(model, "~noName model~");
        this.year = year > 0.0d ? year : 2000;
        this.country = validOrDefault(country, "~noName country~");
        this.color = validOrDefault(color, "~white~");
        this.maxSpeed = maxSpeed > 0.0d ? year : 60;
    }

    @Override
    public String toString() {
        return "Transport{" + "Бренд: " + brand + ". Модель: " + model + ". Год:" + year + ". Страна: " + country +
                ". Цвет: " + color + ". Макс. скорость: " + maxSpeed + "}";
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
