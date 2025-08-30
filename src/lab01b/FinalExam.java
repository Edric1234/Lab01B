/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01b;

/**
 *
 * @author Edric
 */
public class FinalExam extends GradedActivity {
    protected int numQuestions;
    protected double pointsEach;
    protected  int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        
        pointsEach = 100.0 / numQuestions;
        System.out.println("Each question counts " + pointsEach + "points");
        score = 100.0 - (numMissed * pointsEach);
        System.out.println("The exam score is " + score);
        setScore(score);
        System.out.println("The exam grade is " + getGrade());
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    
    
    
}
