import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class backpack {
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<instructor> prof = new ArrayList<>();
    public static ArrayList<student> students = new ArrayList<>();
    public static ArrayList<LectureSlides> slides = new ArrayList<>();
    public static ArrayList<Lecturevid> lecture = new ArrayList<>();
    public static ArrayList<String> content = new ArrayList<>();
    public static ArrayList<Assignment> assnm = new ArrayList<>();
    public static ArrayList<Comments> comm = new ArrayList<>();
    public static ArrayList<Quiz> quizi = new ArrayList<>();
    //public static ArrayList<Submissions> submission = new ArrayList<>();
    public static instructor i0 = new instructor("I0");
    public static instructor i1 = new instructor("I1");
    public static student S0= new student("S0");
    public static student S1= new student("S1");
    public static student S2= new student("S2");

    public static void main(String[] args) {
        double x;
        x = 0;
        while (x != 999999) {
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as a instructor");
            System.out.println("2. Enter as a student");
            System.out.println("3. Exit");

            prof.add(i0);
            prof.add(i1);
            students.add(S0);
            students.add(S1);
            students.add(S2);

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Instructors: ");
                for (int i = 0; i < prof.size(); i++) {
                    System.out.println(prof.get(i).getId() + "-" + prof.get(i).getName());
                }
                System.out.println("Choose ID : ");
                int p_id = scanner.nextInt();
                instructor this_instructor = prof.get(p_id);
                System.out.println("Welcome" + " "+ this_instructor.getName());


                System.out.println("INSTRUCTOR MENU");
                System.out.println("1. Add class material");
                System.out.println("2. Add assesment");
                System.out.println("3. View lecture materials");
                System.out.println("4. View assesments");
                System.out.println("5. Grade assesments");
                System.out.println("6. Close assesments");
                System.out.println("7. View comments");
                System.out.println("8. Add comments");
                System.out.println("9. Logout");

                int choi = scanner.nextInt();
                while (choi != 9) {
                    if (choi == 1) {
                        System.out.println("1. Add lecture slide");
                        System.out.println("2. Add lecture video");

                        int add = scanner.nextInt();
                        if (add == 1) {
                            System.out.println("Enter topic of slides:");
                            String topic = scanner.next();
                            System.out.println("Enter no of slides:");
                            int no = scanner.nextInt();
                            System.out.println("Enter content of slides");
                            for (int i = 0; i < no; i++) {
                                int z = i + 1;
                                System.out.println("Content of slide" + " " + z + ":");
                                String content_name = scanner.next();
                                content.add(content_name);
                            }
                            LectureSlides sl = new LectureSlides(topic, no, content);
                            sl.setProfessor(this_instructor);
                            sl.setD(new Date());
                            slides.add(sl);
                        } else if (add == 2) {
                            System.out.println("Enter topic of video:");
                            String topic1 = scanner.next();
                            System.out.println("Enter filename of video:");
                            ArrayList<String> lvideo = new ArrayList<>();
                            String no1 = scanner.next();
                            lvideo.add(no1);
                            Lecturevid l1 = new Lecturevid(topic1, lvideo);
                            l1.setProfessor(this_instructor);
                            l1.setD(new Date());
                            lecture.add(l1);
                        }
                    }

                    if (choi == 2) {
                        System.out.println("1. Add Assignment");
                        System.out.println("2. Add Quiz");

                        int addo = scanner.nextInt();
                        if (addo == 1) {
                            System.out.println("Enter problem statement:");
                            String name = scanner.next();
                            System.out.println("Enter Max Marks:");
                            int max = scanner.nextInt();
                            Assignment A1 = new Assignment(name, max);
                            assnm.add(A1);

                        } else if (addo == 2) {
                            System.out.println("Enter quiz question:");
                            String ques = scanner.next();
                            System.out.println("Enter Max Marks:");
                            int maxi = scanner.nextInt();
                            Quiz Q1 = new Quiz(ques, maxi);
                            quizi.add(Q1);
                        }

                    }

                    if (choi == 3) {
                        this_instructor.view_lecture();
                    }

                    if (choi == 4) {
                        this_instructor.view_assesments();
                    }

                    if (choi == 5) {
                        System.out.println("List of assessments");
                        this_instructor.view_assesments();
                        System.out.println("Enter ID of assessment to view submissions:");
                        int nu=scanner.nextInt();
                        System.out.println("Choose ID from these ungraded submissions");
                        for(int i=0;i<
                                assnm.get(nu).get_add_submission().size();i++)
                    System.out.println(    assnm.get(nu).get_add_submission().get(i).getName1());
    int ch=scanner.nextInt();// choice is not the index but the studnet index name
    System.out.println("Submission:");
    System.out.println( "Submission" +  assnm.get(nu).get_add_submission().get(ch).getSubname());
                        System.out.println("----------------------------");
                        for (int k=0;k<assnm.size();k++){
                        System.out.println("Max Marks"+ assnm.get(k).getMax_marks());
                        System.out.println("Marks Scored:");
                        int maz= scanner.nextInt();
                        assnm.get(nu).get_add_submission().get(ch).setMarks(maz);
                    }}

                    if (choi == 6) {
                        System.out.println("List of open Assignments:");
                        this_instructor.view_assesments();
                        System.out.println("Enter id of assignment to close:");
                        int del= scanner.nextInt();
                        assnm.remove(del);
                    }

                    if (choi == 7) {
                        this_instructor.view_comments();
                    }

                    if (choi == 8) {
                        String str1= "i"+Integer.toString(p_id);
                        this_instructor.add_comments(str1);

                    }
                    System.out.println("Welcome " + this_instructor.getName());
                    System.out.println("INSTRUCTOR MENU");
                    System.out.println("1. Add class material");
                    System.out.println("2. Add assesment");
                    System.out.println("3. View lecture materials");
                    System.out.println("4. View assesments");
                    System.out.println("5. Grade assesments");
                    System.out.println("6. Close assesments");
                    System.out.println("7. View comments");
                    System.out.println("8. Add comments");
                    System.out.println("9. Logout");
                    choi = scanner.nextInt();

                }

            } else if (choice == 2) {

                System.out.println("Students: ");
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i).getId() + "-" + students.get(i).getName());
                }

                System.out.println("Choose ID : ");
                int s_id = scanner.nextInt();
                student this_student = students.get(s_id);
                System.out.println("Welcome" + " "+  this_student.getName());

                System.out.println("STUDENT MENU");
                System.out.println("1. View lecture materials");
                System.out.println("2. View assesments");
                System.out.println("3. Submit assesments");
                System.out.println("4. View grades");
                System.out.println("5. View comments");
                System.out.println("6. Add comments");
                System.out.println("7. Logout");

                int choic=scanner.nextInt();
                while(choic!=7) {
                    if (choic == 1) {
                        this_student.view_lecture();
                        break;
                    }

                    if (choic == 2) {
                        this_student.view_assesments();
                        break;
                    }

                    if (choic == 3) {
                        System.out.println("Pending Assignments:");
                        this_student.view_assesments();
                        System.out.println("Enter id of assignment :");
                        int su= scanner.nextInt();
                  //
                        System.out.println("Enter filename of assignment:");
                        String subm= scanner.next();
                        Submissions S1= new Submissions(subm);
                        S1.setName1("s"+Integer.toString(s_id));
                    //    System.out.println(assnm.get(su));
                        assnm.get(su).set_add_submission(S1);
                   //     assnm.remove((su));
//                        for(int j=0;j< assnm.get(0).get_add_submission().size();j++)
//
//                        System.out.println(assnm.get(0).get_add_submission().get(j).getSubname()+"  "+assnm.get(0).get_add_submission().get(j).getGrades());
                        break;
                    }

                    if (choic == 4) {


                    }

                    if (choic == 5) {
                        this_student.view_comments();
                    }

                    if (choic == 6) {
                        String a1="s"+ Integer.toString(s_id);
                        this_student.add_comments(a1);

                    }

                    System.out.println("STUDENT MENU");
                    System.out.println("1. View lecture materials");
                    System.out.println("2. View assesments");
                    System.out.println("3. Submit assesments");
                    System.out.println("4. View grades");
                    System.out.println("5. View comments");
                    System.out.println("6. Add comments");
                    System.out.println("7. Logout");

                    Scanner sca = new Scanner(System.in);

                    choic = scanner.nextInt();

                }
            }
            else if (choice==3){
                break;
            }
        }
    }
}