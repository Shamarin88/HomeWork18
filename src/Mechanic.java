public class Mechanic<T extends Race> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public void doService(T race) {
        race.service();
    }

    public void doRepair(T race) {
        race.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Механик " + name + " " + surname + " из " + company;
    }
}
