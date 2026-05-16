public class StrengthWorkout extends Workout {
    public StrengthWorkout(int duration) {
        super(duration);
    }
    public void calculateCalories() {
        setCaloriesBurned(getDuration() * 6);
    }
    public String toString() {
        return "Strength Workout - " + super.toString();
    }
}
