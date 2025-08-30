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
        score = 100.0 - (numMissed * pointsEach);
        setScore(score);
    }
    
    
}
