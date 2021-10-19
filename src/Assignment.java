import java.util.ArrayList;

public class Assignment {
    private String Assn;
    private int max_marks;
    private int grade;
    private ArrayList<Submissions> submission1=new ArrayList<>();


    public Assignment( String Assn, int max_marks){
        this.Assn=Assn;
        this.max_marks=max_marks;

    }




    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMax_marks() {
        return max_marks;
    }

    public String getAssn() {
        return Assn;
    }

    public void setAssn(String assn) {
        Assn = assn;
    }

    public void setMax_marks(int max_marks) {
        this.max_marks = max_marks;
    }

    public void set_add_submission(Submissions s1) {
      //  System.out.println(s1);
        submission1.add(s1);
    }
        public ArrayList<Submissions> get_add_submission()
        {
            return submission1;
        }
}


