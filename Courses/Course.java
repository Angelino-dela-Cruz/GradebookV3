import java.util.*;

public class Course {
  private double numGrade = 100.0;
  private String courseName;
  public Course(String name) {
    this.courseName = name;
  }

  public String getName() {
    return courseName;
  }
}