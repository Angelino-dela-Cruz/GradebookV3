import java.util.*;


public class Student extends User{
  private double cumulativeGPA = 4.0;
  private int courseCount;

  public Student(String name, String userName, String password,ArrayList<Course> courses) {
    super(name, userName, password, courses);
    this.courseCount = courseCount;
    System.out.println(name);
  }
}