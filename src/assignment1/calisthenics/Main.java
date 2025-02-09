package assignment1.calisthenics;

public class Main{
    public static void main(String[] args){
        //Object for different exercises(classes)
        CalisthenicsExercise pushUp = new PushUp( 10,  "Beginner");
        CalisthenicsExercise pullUp = new PullUp(5, "Beginner");
        CalisthenicsExercise squat = new Squat(15, "Beginner");

        //Initial performance
        System.out.println("Initial performance:");
        pushUp.performExercise();
        pullUp.performExercise();
        squat.performExercise();

        //Apply progression
        ProgressiveOverload[] exercises = new ProgressiveOverload[] {
                (ProgressiveOverload) pushUp,
                (ProgressiveOverload) pullUp,
                (ProgressiveOverload) squat
        };
        for (ProgressiveOverload exercise : exercises) {
            exercise.increaseReps();
            exercise.increaseDifficulty();
        }

        //Performance after progression
        System.out.println("\nAfter progression:");
        pushUp.performExercise();
        pullUp.performExercise();
        squat.performExercise();
    }

}