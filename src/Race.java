import java.util.ArrayList;
import java.util.List;

public abstract class Race implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean diagnosticComplete;

    private List<Sponsor> sponsors;
    private List<Mechanic<?>> mechanics;

    public Race(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanics = new ArrayList<>();
        this.sponsors = new ArrayList<>();
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
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

    public void adSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public void adMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public abstract void startRace();

    public abstract void endRace();

    public abstract boolean service();
    public abstract void repair();

    public boolean isDiagnosticComplete() {
        return diagnosticComplete;
    }
    public static void diagnosticTransport(Race...races) {
        for (Race race: races) {
            if (!race.completeDiagnostic()) {
                try {
                    throw new RuntimeException(race.getBrand() + " " + race.getModel() + " не прошел диагностику!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!sponsors.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsors.size(); i++) {
            result.append(sponsors.get(i));
            if (i != sponsors.size() - 1) {
                result.append(", ");
            }
        }
        result.append("\n");
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }
        }
                return result.toString();
    }
}
