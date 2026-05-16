import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker tracker = new Tracker();

        while (true) {
            System.out.println("\nWelcome to Fitness Tracker!");
            System.out.println("1. Add Cardio Workout");
            System.out.println("2. Add Strength Workout");
            System.out.println("3. Show Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            if (choice == 4) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter duration (minutes): ");
                    int cardioDuration = sc.nextInt();
                    Workout cardio = new CardioWorkout(cardioDuration);
                    cardio.calculateCalories();
                    tracker.addWorkout(cardio);
                    System.out.println("Added: " + cardio);
                    break;
                case 2:
                    System.out.print("Enter duration (minutes): ");
                    int strengthDuration = sc.nextInt();
                    Workout strength = new StrengthWorkout(strengthDuration);
                    strength.calculateCalories();
                    tracker.addWorkout(strength, "Strength training logged.");
                    System.out.println("Added: " + strength);
                    break;
                case 3:
                    tracker.showSummary();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
        System.out.println("Goodbye!");
    }
}
