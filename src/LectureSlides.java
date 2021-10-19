import java.util.ArrayList;
import java.util.Date;

public class LectureSlides {
    private String title;
    private int no_slides;
    private instructor professor;
    private Date d;
    private ArrayList<String> content;

    public LectureSlides(String topic, int slides, ArrayList<String> cont)
    {
        this.title = topic;
        this.no_slides = slides;
        this.content = cont;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public Date getD() {
        return d;
    }

    public instructor getProfessor() {
        return professor;
    }

    public int getNo_slides() {
        return no_slides;
    }

    public String getTitle() {
        return title;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setNo_slides(int no_slides) {
        this.no_slides = no_slides;
    }

    public void setProfessor(instructor professor) {
        this.professor = professor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }
}
