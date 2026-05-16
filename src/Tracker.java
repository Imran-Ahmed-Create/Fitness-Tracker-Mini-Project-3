import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private List<Workout> workouts = new ArrayList<>();

    public void addWorkout(Workout w) {
        workouts.add(w);
    }

    // Overloaded method with a note
    public void addWorkout(Workout w, String note) {
        workouts.add(w);
        System.out.println("Note: " + note);
    }

    public void showSummary() {
        if (workouts.isEmpty()) {
            System.out.println("No workouts logged yet.");
            return;
        }
        System.out.println("Workout Summary:");
        for (Workout w : workouts) {
            System.out.println(w);
        }
    }
}
