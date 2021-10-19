import java.util.Date;

public class Comments {
    private String comment;
    private instructor professor;
    private Date d;
    private student stu;
    private String comment_adder;
    public Comments (String comment){
        this.comment=comment;
    }

    public Date getD() {
        return d;
    }

    public instructor getProfessor() {
        return professor;
    }

    public void setComment_adder(String comment_adder) {
        this.comment_adder = comment_adder;
    }

    public String getComment_adder() {
        return comment_adder;
    }

    public String getComment() {
        return comment;
    }

    public student getStu() {
        return stu;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setProfessor(instructor professor) {
        this.professor = professor;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStu(student stu) {
        this.stu = stu;
    }
}
