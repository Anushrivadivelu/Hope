package day7;

public class SingleInheritance {
  public static void main(String[] args) {
    Dog  d = new Dog();
    d.bark();
    System.out.println(d.hashCode());
    
  }
}
class Animal{
  void display(){
    System.out.println("Animal");
  }
}

class Dog extends Animal{
  void bark(){
    System.out.println("Dog barks");
  }
}