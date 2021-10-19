import java.util.ArrayList;
import java.util.Date;

public class Quiz {
    private String ques;
    private int marks;
    private int grades;

    public Quiz( String ques, int marks){
        this.ques=ques;
        this.marks=marks;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public int getMarks() {
        return marks;
    }

    public String getQues() {
        return ques;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }
}
