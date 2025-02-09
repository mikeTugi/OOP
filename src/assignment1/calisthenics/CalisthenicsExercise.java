package assignment1.calisthenics;

// Abstract class reping a general calisthenics exercises
public abstract class CalisthenicsExercise{
    String name;
    int reps;
    String difficulty;

//Constructors
public CalisthenicsExercise( String name, int reps, String difficulty) {
    this.name = name;
    this.reps = reps;
    this.difficulty = difficulty;
}
//Abstract method that must be implemented by concrete classes
   public abstract void performExercise();
}