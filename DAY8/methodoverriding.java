package day8;
class Parent{
  void add(int a,int b){
    System.out.println("from parent class "+(a+b));
  }
}
class child extends Parent{
  void add(int a,int b){
    System.out.println("from child class "+ (a+b));
  }
  void add(int a,int b,int c){
    System.out.println("from child class "+ (a+b+c));
  }
}
public class methodoverriding{
  public static void main(String[] args) {
    Parent p = new Parent();
    p.add(1, 4);
    child c = new child();
    c.add(2, 3);
    c.add(3, 4, 5);
    Parent pc = new child();
    pc.add(1, 5);
  }
}
