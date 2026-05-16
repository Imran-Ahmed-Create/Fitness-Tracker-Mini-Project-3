-Fitness Tracker Console Application

OOP/Java Project

This project is a simple console-based fitness tracker that allows users to log different types of workouts, calculate calories burned, and view a summary of their sessions. developed to demonstrate key Object-Oriented Programming principles in Java.
-Project Overview
The application supports two workout categories: Cardio and Strength. Each workout records its duration and automatically calculates calories burned using different formulas based on the workout type. All workouts are managed through a central Tracker class that stores and displays the history.

-Key Features
Add Cardio workouts (8 calories per minute)
Add Strength workouts (6 calories per minute)
i used Automatic calorie calculation
Input validation (also prevents invalid durations)
Workout summary display

-OOP Concepts Demonstrated

Inheritance: The abstract Workout class serves as the base for CardioWorkout and StrengthWorkout. Both subclasses inherit common attributes and behavior while customizing the calorie calculation.
Abstraction: Used an abstract class with an abstract calculateCalories() method. This forces subclasses to provide their own implementation while maintaining a consistent interface.
Polymorphism: The Tracker class works with Workout references. This allows it to handle both CardioWorkout and StrengthWorkout objects uniformly. Method overriding is clearly shown in the different calorie calculations and toString() behaviors.
Encapsulation: All data fields are private. Access is controlled through getter and setter methods. For example, setDuration() includes validation to ensure only positive values are accepted.
Method Overloading: The Tracker class has two addWorkout() methods — one with just the workout and another that also takes a note. This shows how the same method name can be used with different parameters.
Composition: The Tracker class contains a list of Workout objects, showing a "has-a" relationship.

-Design Decisions
I chose an abstract base class instead of an interface because I wanted to provide some common implementation (like duration handling and the toString() method) while still allowing flexibility in subclasses.
The calorie calculation logic is kept inside each workout class. This keeps each class responsible for its own behavior, which follows the Single Responsibility Principle. The Main class is kept minimal — it only handles user interaction, while the actual logic lives in the dedicated classes.
Error handling is basic but effective (e.g., rejecting zero or negative durations). The code is structured to be easily extensible — adding a new workout type (like Yoga or HIIT) would only require creating a new subclass.
