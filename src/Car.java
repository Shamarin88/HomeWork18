import java.util.List;

public class Car extends Race implements Competing {
    private final String pitStop = " заезжает на Пит-Стоп";
    private final String bestLapTime = "2:14:18";
    private final Integer maxSpeed = 230;

    private Driver driver;

    private Sponsor sponsor;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        this.driver = driver;
        this.sponsor = sponsor;
        setDriver(driver);
        setSponsor(sponsor);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public enum CarType {
        CAR_TYPE("Легковой автомобиль");

        private final String carType;

        CarType(String carType) {
            this.carType = carType;
        }

        public String getCarType() {
            return carType;
        }
    }

    public enum BodyType {
        CAR_SEDAN("Седан"), CAR_HATCHBACK("Хетчбек"), CAR_COUPE("Купе"), CAR_UNIVERSAL("Универсал"),
        CAR_CROSSROAD("Внедорожник"), CAR_CROSSOVER("Кроссовер"), CAR_PICKUP("Пикап"), CAR_VAN("Фургон"),
        CAR_MINIVAN("Минивэн");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова " + bodyType;
        }
    }

    @Override
    public void startRace() {
        System.out.println(getModel() + " " + getBrand() + " начинает движение");
        System.out.println(getModel() + " " + getBrand() + " набирает скорость");
    }

    @Override
    public void endRace() {
        System.out.println(getModel() + " " + getBrand() + " сбрасывает скорость");
        System.out.println(getModel() + " " + getBrand() + " останавливается");
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Авто " + getBrand() + " " + getModel() + " чинится");
    }

    @Override
    public void getPitStop() {
        System.out.println(getModel() + " " + getBrand() + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println(getModel() + " " + getBrand() + " Лучшее время круга " + bestLapTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println(getModel() + " " + getBrand() + " Максимальная скорость " + maxSpeed);
    }

    @Override
    public void printType() {
        if (CarType.CAR_TYPE.carType == null || CarType.CAR_TYPE.carType.isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(CarType.CAR_TYPE.carType);
        }
    }

    @Override
    public boolean completeDiagnostic() {
        return this.isDiagnosticComplete();
    }

    @Override
    public String toString() {
        return "Автомобиль с водителем " + driver;
    }
}
