public class Driver2 <B extends Truck> {
    private String driverName;
    private String driverLicence;
    private int driverExperience;

    public Driver2(String driverName, String driverLicence, int driverExperience) {
        this.driverName = driverName;
        this.driverLicence = driverLicence;
        this.driverExperience = driverExperience;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
    public void startMoving(B car) {
        System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде");

    }
    public void stopMoving() {

    }
    public void refuel() {

    }
}
