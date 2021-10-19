import java.util.ArrayList;
import java.util.Date;

public class Lecturevid {
    private String topic;
    private ArrayList<String> fname;
    private instructor professor;
    private Date d;

    public Lecturevid(String topic, ArrayList<String> fname)
    {
        this.topic = topic;
        this.fname = fname;
    }

    public ArrayList<String> getFname() {
        return fname;
    }

    public String getTopic() {
        return topic;
    }

    public instructor getProfessor() {
        return professor;
    }

    public Date getD() {
        return d;
    }

    public void setProfessor(instructor professor) {
        this.professor = professor;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setFname(ArrayList<String> fname) {
        this.fname = fname;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
