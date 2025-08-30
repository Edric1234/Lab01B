/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01b;

/**
 *
 * @author Edric
 */
public class PassFailActivity extends GradedActivity {
    protected double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    @Override
    public char getGrade() {
        if (score >= minPassingScore) return 'P';
        else {
            return 'F';
        }
    }
    
    
}
