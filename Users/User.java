import java.util.*;
import java.io.*;


//this is the parent class

public class User {
  private String name, userName, password;
  private ArrayList<Course> courses;
  public User(String name, String userName,String password, ArrayList<Course> courses) {
    this.name= name;
    this.userName = userName;
    this.password = password;
    this.courses = courses;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }
}