public class Driver3 <C extends Bus> {
    private String driverName;
    private String driverLicence;
    private int driverExperience;

    public Driver3(String driverName, String driverLicence, int driverExperience) {
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

    public void startMoving(C car) {
        System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде");

    }
    public void stopMoving() {

    }
    public void refuel() {

    }
}
