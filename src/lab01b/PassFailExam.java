/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01b;

/**
 *
 * @author Edric
 */
public class PassFailExam extends PassFailActivity {
    protected int numQUestions;
    protected double pointsEach;
    protected int numMissed;

    public PassFailExam(int numQUestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQUestions = numQUestions;
        this.numMissed = numMissed;
    }
    
    
}
