import java.util.Date;
import java.util.Scanner;

public class student implements common {
    public static Scanner scanner = new Scanner(System.in);

    private int id;
    private String name;
    private static int count = 0;

    public student(String name) {
        this.name = name;
        this.id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add_comments(String i0) {
        System.out.println("Enter comment:");
        String commi = scanner.next();
        Comments C1 = new Comments(commi);
        C1.setComment_adder(i0);
        C1.setD(new Date());
        backpack.comm.add(C1);

    }

    @Override
    public void view_comments() {
        for (int i = 0; i <= backpack.comm.size(); i++) {
            System.out.println(backpack.comm.get(i).getComment() + "-" + backpack.comm.get(i).getComment_adder());
            System.out.println(backpack.comm.get(i).getD());
        }}

        @Override
        public void view_lecture () {
            for (int i = 0; i < backpack.slides.size(); i++) {
                System.out.println("Title:" + backpack.slides.get(i).getTitle());
                for (int j = 0; j < backpack.content.size(); j++) {
                    int p = i + 1;
                    System.out.println("Slide" + " " + p + ":" + backpack.content.get(j));
                }
                System.out.println("Date of upload:" + backpack.slides.get(i).getD());
                System.out.println("Uploaded by:" + backpack.slides.get(i).getProfessor().getName());

            }
            for (int i = 0; i < backpack.lecture.size(); i++) {
                System.out.println("Title of video:" + backpack.lecture.get(i).getTopic());
                System.out.println("Video file:" + backpack.lecture.get(i).getFname().get(i));
                System.out.println("Uploaded by:" + backpack.lecture.get(i).getProfessor().getName());
                System.out.println("Date of upload:" + backpack.lecture.get(i).getD());

            }

        }

        @Override
        public void view_assesments ()
        {
            for (int i = 0; i < backpack.assnm.size(); i++) {
                System.out.println("ID:" + backpack.prof.get(i).getId() + " " + "Assignment:" + backpack.assnm.get(i).getAssn() + " " + "Max Marks:" + backpack.assnm.get(i).getMax_marks());

            }
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < backpack.quizi.size(); i++) {
                System.out.println("ID:" + backpack.prof.get(i).getId() + " " + "Question:" + backpack.quizi.get(i).getQues() + " " + "Max Marks:" + backpack.quizi.get(i).getMarks());
            }
            System.out.println("---------------------------------------------------------");
        }


}
