package day17;
import java.util.*;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

class Student implements Comparable<Student>{
  String name;
  int rollno;
  Student(String name , int rollno){
    this.name = name;
    this.rollno = rollno;
  }
  public int compareTo(Student s){
    return this.rollno - s.rollno;
    //return s.rollno - this.rollno;
    //return s.name(compareTo(this.name));
    //return this.name(compareTo(.name));
  }
}
public class comparableimplementation {
  public static void main(String[] args) {
    List<Student> lis = new ArrayList<>();
    lis.add(new Student("anu",123));
    lis.add(new Student("andf",23));
    Collections.sort(lis);
    for(Student std : lis){
      System.out.println(std.rollno+" "+std.name);
    }
  }
}
