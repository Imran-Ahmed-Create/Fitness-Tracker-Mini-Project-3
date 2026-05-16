public class CardioWorkout extends Workout {
    public CardioWorkout(int duration) {
        super(duration);
    }

    public void calculateCalories() {
        setCaloriesBurned(getDuration() * 8);
    }

    public String toString() {
        return "Cardio Workout - " + super.toString();
    }
}
