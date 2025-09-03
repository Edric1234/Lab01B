/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01b;

/**
 *
 * @author Edric
 */
public class Essay extends GradedActivity {
    protected double grammar;
    protected double spelling;
    protected double correctLength;
    protected double content;

    public Essay() {
    }

    public Essay(double grammar, double spelling, double correctLength, double content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
    }

    public void setScore(double grammar, double spelling, double length, double content) {
        super.score = grammar + spelling + length + content;
    }

    @Override
    public String toString() {
        return "Total points: " + score + "\n"
                + "Grade: " + getGrade();
    }

    public double getGrammar() {
        return grammar;
    }
    
    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
}
