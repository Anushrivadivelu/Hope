package day7;

public class SimpleInheritance {
  public static void main(String[] args) {
    System.out.println("from main function");
    Child c = new Child();
    c.display1();
    Parent p = new Parent();
    Parent p1 = new Child();
    //Child c1 = new Parent(); -- causes type mismatch error
    p.display();
    p1.display();
  }
}
class Parent{
  int x= 10;
  void display(){
    System.out.println("from parent class");
  }
}
class Child extends Parent{
  void display1(){
    System.out.println("from child class "+x);
  }
}
