import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Gradebook ");
    System.out.println("Are you a Teacher(T) or Student(S)? ");
    ArrayList<Course> crses = new ArrayList<Course>();
    crses.add(new StudentCourse("Advanced Topics"));
    crses.add(new StudentCourse("AP English"));
    if (sc.nextLine().equals("T")) {
      ArrayList<Course> teachercrses = new ArrayList<Course>();
      System.out.print("Name? ");
      String name = sc.nextLine();
      System.out.print("Username? ");
      String username = sc.nextLine();
      System.out.println("Password? ");
      String password = sc.nextLine();
      System.out.println("Number of Courses? ");
      int courses = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < courses; i++) {
        System.out.println("Name of Course " + (i + 1) + "? ");
        String CourseName = sc.nextLine();
        System.out.println("Number of Students in Course " + (i + 1) + "? ");
        int num = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<Student>();
        for (int j = 0; j < num; j++) {
          System.out.println("Name of student?");
          students.add(new Student(sc.nextLine(), "sohamb", "abc123", crses));
        }
        TeacherCourse course = new TeacherCourse(CourseName, students);
        teachercrses.add(course);
      }
      Teacher teacher = new Teacher(name, username, password, teachercrses);
      System.out.println("Enter Grade(G), View Grades (V) or Quit (Q)");
      String choice = sc.nextLine();
      while (!choice.equals("Q")) {
        System.out.println(choice);
        if (choice.equals("G")) {
          choice = teacher.changeGrade(sc);
          System.out.println("choice " + choice);
        } else if (choice.equals("V")) {
          choice = teacher.viewGrade(sc);
          System.out.println(choice);
        }
      }
    }
  }
}