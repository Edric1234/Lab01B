/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01b;

/**
 *
 * @author Edric
 */
public class CourseGrades implements Analyzable{
   protected GradedActivity[] grades = new GradedActivity[4]; 
   protected int NUM_GRADES = 4;

    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }
   
    @Override
    public double getAverage() {
        double sum = 0;
        for (GradedActivity grade : grades) {
            sum += grade.getScore();
        }
        return sum / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (highest.getScore() < grades[i].getScore()) {
                highest =  grades[i];
            }
        }
        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (lowest.getScore() > grades[i].getScore()) {
                lowest =  grades[i];
            }
        }
        return lowest;    }
    
   public void setLab(GradedActivity aLab) {
       grades[0] = aLab;
   }
   
   public void setPassFailExam(PassFailExam aPassFailExam) {
       grades[1] = aPassFailExam;
   }
   
   public void  setEssay(Essay anEssay) {
       grades[2] = anEssay;
   }
   
   public  void setFinalExam(FinalExam aFinalExam)  {
       grades[3] = aFinalExam;
   }

    @Override
    public String toString() {
        return "Lab score: "  + grades[0].getScore() + "\t" + "Grade: " 
                + grades[0].getGrade() + "\n"
                + "Pass/Fail Exam Score: " + grades[1].getScore() + "\t" + "Grade: " 
                + grades[1].getGrade() + "\n"
                + "Essay Score: " + grades[2].getScore() + "\t" + "Grade: " 
                + grades[2].getGrade() + "\n"
                + "Final Exam Score: " + grades[3].getScore() + "\t" + "Grades: " 
                + grades[3].getGrade()  + "\n";
    }
}
