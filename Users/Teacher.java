import java.util.*;
import java.io.*;

public class Teacher extends User {

  public Teacher(String name, String userName, String password, ArrayList<Course> courses) {
    super(name, userName, password, courses);
    Scanner sc = new Scanner(System.in);
  }

  public String changeGrade(Scanner sc) throws IOException{
    System.out.println("Which Course? ");
    String course = sc.nextLine();
    TeacherCourse change = null;
    for (int i = 0; i < super.getCourses().size(); i++) {
      if (super.getCourses().get(i).getName().equals(course)) {
        change = (TeacherCourse) super.getCourses().get(i);
        break;
      }
    }
    System.out.println("Student? ");
    String chStudent = sc.nextLine();
    System.out.println("Grade? ");
    double grade = sc.nextDouble();
    if(change!= null) {
      change.changeGrade(chStudent, grade);
    }
    System.out.println("Enter Grade(G), View Grades (V) or Quit (Q)");
    String ans = sc.nextLine();
    return ans;
  }

  public String viewGrade(Scanner sc) throws IOException{
    System.out.println("Which Course? ");
    String course = sc.nextLine();
    TeacherCourse change = null;
    for (int i = 0; i < super.getCourses().size(); i++) {
      if (super.getCourses().get(i).getName().equals(course)) {
        change = (TeacherCourse) super.getCourses().get(i);
        break;
      }
    }
    if(change!= null) {
      change.getGrades();
    }
    System.out.println("Enter Grade(G), View Grades (V) or Quit (Q)");
    String ans = sc.nextLine();
    return ans;
  }

}