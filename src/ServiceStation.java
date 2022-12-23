import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Race> races = new ArrayDeque<>();

    public void add(Race race) {
        races.offer(race);
    }
    public void doService() {
        if (!races.isEmpty()) {
            Race race = races.poll();
            boolean result = race.service();
            if (!result) {
                race.repair();
            }
        }
    }
}
