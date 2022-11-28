import java.time.LocalDate;

public class Car extends Transport {

    public double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumbers;
    private final int numberOfSeats;
    private String tiresWinterOfSummer;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String transmission, String bodyType,
               String registrationNumbers, int numberOfSeats, String tiresWinterOfSummer) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume < 0.0d ? engineVolume : 1.5d;
        this.transmission = validOrDefault(transmission, "MEX");
        this.bodyType = validOrDefault(bodyType, "~no bodyType~");
        this.registrationNumbers = registrationNumbers;
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 5;
        this.tiresWinterOfSummer = validOrDefault(tiresWinterOfSummer, "___");
    }

    @Override
    public String toString() {
        return "Car {" + "Бренд: " + brand + ". Модель: " + model + ". Цвет: " + color + ". Макс. скорость: " + maxSpeed +
                ". Объем двиг: " + engineVolume + ". Коробка передач: " + transmission + ".\n Кузов: " + bodyType +
                ". Рег. номер: " + registrationNumbers + ". Кол-во сидячих мест: " + numberOfSeats + ". Тип резины: " + tiresWinterOfSummer + "}";
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public boolean registrationNumbersValid() {
        if (registrationNumbers.length() != 8) {
            return false;
        }
        char[] regNumberChars = this.registrationNumbers.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth >= 11 || currentMonth <= 3) {
            this.tiresWinterOfSummer = "Зимняя";
        } else {
            this.tiresWinterOfSummer = "Нужно переобуться на зимнюю";
        }
    }

    @Override
    public void refill() {
        System.out.println("Можно  заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, " +
                "если это электрокар");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumbers() {
        return registrationNumbers;
    }

    public void setRegistrationNumbers(String registrationNumbers) {
        this.registrationNumbers = registrationNumbers;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTiresWinterOfSummer() {
        return tiresWinterOfSummer;
    }

    public void setTiresWinterOfSummer(String tiresWinterOfSummer) {
        this.tiresWinterOfSummer = tiresWinterOfSummer;
    }
}