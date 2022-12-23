import java.util.List;

public class Bus extends Race {
    private final String pitStop = " заезжает на Пит-Стоп";
    private final String bestLapTime = "5:18:20";
    private final Integer maxSpeed = 150;

    private Driver3 driver3;

    private Sponsor sponsor;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        this.driver3 = driver3;
        this.sponsor = sponsor;
        setDriver3(driver3);
        setSponsor(sponsor);
    }

    public void setDriver3(Driver3 driver3) {
        this.driver3 = driver3;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public enum BusType {
        BUS_TYPE("Автобус");

        private final String busType;

        BusType(String busType) {
            this.busType = busType;
        }

        public String getBusType() {
            return busType;
        }
    }

    public enum SeatCapacity {
        XS(0,10),S(0,25),M(40,50),XL(60,80),XXL(100,120);

        private final Integer minSeatCapacity;
        private final Integer maxSeatCapacity;

        SeatCapacity(Integer minSeatCapacity, Integer maxSeatCapacity) {
            this.minSeatCapacity = minSeatCapacity;
            this.maxSeatCapacity = maxSeatCapacity;
        }

        public Integer getMinSeatCapacity() {
            return minSeatCapacity;
        }

        public Integer getMaxSeatCapacity() {
            return maxSeatCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость: от " + minSeatCapacity + " - " + maxSeatCapacity + " мест";
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
        if (BusType.BUS_TYPE.busType == null || BusType.BUS_TYPE.busType.isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(BusType.BUS_TYPE.busType);
        }
    }

    @Override
    public boolean completeDiagnostic() {
        System.out.println("Автобусы не проходят диагностику");
        return false;
    }

    @Override
    public String toString() {
        return "Автобус с водителем " + driver3;
    }
}
