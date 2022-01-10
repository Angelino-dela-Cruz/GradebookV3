import java.io.*;
import java.util.*;


public class TeacherCourse extends Course {
  ArrayList<Student> students;
  public TeacherCourse(String name, ArrayList<Student> students) throws IOException{
    super(name);
    String filepath = name + ".csv";
    this.students = students;
    PrintStream pw = new PrintStream(filepath);
    for(int i = 0; i < students.size(); i++) {
      saveRecord(pw, students.get(i).getName(), 100.00);
    } 
  }

  public static void saveRecord(PrintStream pw, String studentName, double grade) throws IOException{
    pw.println(studentName + ", " + grade);
  }

  public void changeGrade(String studentName, double newGrade)throws IOException{
    String name = "";
    String grade = "";
    String filepath = "temp.csv";
    String oldFilepath = super.getName() + ".csv";
    File oldfile = new File(oldFilepath);
    File newfile = new File(filepath);
    PrintStream pw = new PrintStream(filepath);
    Scanner sc = new Scanner(new File(oldFilepath));
    sc.useDelimiter("[,\n]");
    while(sc.hasNext()) {
      name = sc.next();
      grade = sc.next();
      if(name.equals(studentName)) {
        pw.println(name + ", " + newGrade);
      } 
      else {
        pw.println(name + "," + grade);
      }
    }
    sc.close();
    pw.close();
    oldfile.delete();
    File dump = new File(oldFilepath);
    newfile.renameTo(dump);
  }


  public void getGrades()throws IOException{
    String filepath = super.getName() + ".csv";
    Scanner sc = new Scanner(new File(filepath));
    sc.useDelimiter("[,\n]");
    String name = "";
    String grade = "";
    while(sc.hasNext()) {
      name = sc.next();
      grade = sc.next();
      System.out.println("Name: " + name + " Grade: " + grade);
    }
    sc.close();
  }
  
}