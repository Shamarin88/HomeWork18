import java.util.List;

public class Truck extends Race {
    private final String pitStop = " заезжает на Пит-Стоп";
    private final String bestLapTime = "3:15:20";
    private final Integer maxSpeed = 190;

    private Driver2 driver2;

    private Sponsor sponsor;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        this.driver2 = driver2;
        this.sponsor = sponsor;
        setDriver2(driver2);
        setSponsor(sponsor);
    }

    public void setDriver2(Driver2 driver2) {
        this.driver2 = driver2;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public enum TruckType {
        TRUCK_TYPE("Грузовой автомобиль");

        private final String truckType;

        TruckType(String truckType) {
            this.truckType = truckType;
        }

        public String getTruckType() {
            return truckType;
        }
    }

    public enum LoadCapacity {
        N1(0,3.5), N2(3.5, 12), N3(12, 25);

        private final double minLoadCapacity;
        private final double maxLoadCapacity;

        LoadCapacity(double minLoadCapacity, double maxLoadCapacity) {
            this.minLoadCapacity = minLoadCapacity;
            this.maxLoadCapacity = maxLoadCapacity;
        }

        public double getMinLoadCapacity() {
            return minLoadCapacity;
        }

        public double getMaxLoadCapacity() {
            return maxLoadCapacity;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: от " + minLoadCapacity + " тонн  до " + maxLoadCapacity + " тонн";
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
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " чинится");
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
        if (TruckType.TRUCK_TYPE.truckType == null || TruckType.TRUCK_TYPE.truckType.isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(TruckType.TRUCK_TYPE.truckType);
        }
    }

    @Override
    public boolean completeDiagnostic() {
        return this.isDiagnosticComplete();
    }

    @Override
    public String toString() {
        return "Грузовик с водителем " + driver2;
    }
}
