package assignment1.calisthenics;

//concrete class reping a Push-up exercise
public class PushUp extends CalisthenicsExercise implements ProgressiveOverload {

    public PushUp(int reps, String difficulty){
        super( "Push-Up", reps, difficulty);

    }

    @Override
    public void performExercise() {
        System.out.println("Performing " + reps + "reps of" + difficulty + " "+ name + "s.");
    }

    @Override
    public void increaseReps() {
        reps += 5;
        System.out.println("Increased reps for " + name + ". Now doing " + reps + " reps.");
    }

    @Override
    public void increaseDifficulty() {
        if ( difficulty.equalsIgnoreCase( "Beginner"))
            difficulty = "Intermediate";
        else if (difficulty.equalsIgnoreCase("Intermediate"))
             difficulty = "Advanced";
        else {
            System.out.println(name +"is already at the highest difficulty.");
            return;
        }
        System.out.println("Increased difficulty for " + name + ". Now performing " + difficulty + " " + name + "s.");

    }
}