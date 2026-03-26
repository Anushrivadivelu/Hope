package day7;

public class ThisKeyword {
  public static void main(String[] args) {
    NameAndRoll nr = new NameAndRoll("Anu", 129);
    nr.display();
    System.out.println(nr.hashCode());

    NameAndRoll nr1 = new NameAndRoll("Anu", 1209);
    nr.display();
    System.out.println(nr1.hashCode());

    NameAndRoll nr2 = new NameAndRoll("Anu", 129999);
    nr.display();
    System.out.println(nr2.hashCode());
  }
}
class NameAndRoll{
  String name;
  int roll;
  NameAndRoll(String name, int roll){
    this.name = name;
    this.roll = roll;
  }
  void display(){
    System.out.println("Name: "+ name);
    System.out.println("Rollno: "+ roll);
  }
}