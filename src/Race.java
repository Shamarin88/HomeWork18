public abstract class Race implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean diagnosticComplete;

    public Race(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startRace();

    public abstract void endRace();

    public boolean isDiagnosticComplete() {
        return diagnosticComplete;
    }
    public static void diagnosticTransport(Race...races) {
        for (Race race: races) {
            if (!race.completeDiagnostic()) {
                try {
                    throw new RuntimeException(race.getBrand() + " " + race.getModel() + "не прошел диагностику!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
