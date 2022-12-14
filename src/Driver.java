public class Driver <A extends Car> {
    private String driverName;
    private String driverLicence;
    private int driverExperience;

    public Driver(String driverName, String driverLicence, int driverExperience) {
        this.driverName = driverName;
        this.driverLicence = driverLicence;
        this.driverExperience = driverExperience;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void startMoving(A car) {
        System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде");

    }
    public void stopMoving() {

    }
    public void refuel() {

    }
}
