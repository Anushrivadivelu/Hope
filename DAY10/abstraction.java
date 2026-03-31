package day9;
abstract class Animal{
  abstract void sound();
  void eat(){
    System.out.println("eat");
  }
}
class dog extends Animal{
  void sound(){
    System.out.println("sound");
  }
}
class cat extends Animal{
  void sound(){
    System.out.println("cat");
  }
}
public class abstraction {
  public static void main(String[] args) {
    Animal c =new cat();
    c.eat();
    c.sound();
  }
}
