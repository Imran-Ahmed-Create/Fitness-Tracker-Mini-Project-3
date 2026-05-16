public abstract class Workout {
    private int duration; // minutes
    private double caloriesBurned;

    public Workout(int duration) {
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be positive.");
        }
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    protected void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public abstract void calculateCalories();

    public String toString() {
        return "Workout: " + duration + " minutes, Calories: " + caloriesBurned;
    }
}
