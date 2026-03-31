package day8;

class Animal{
  void sound(){
    System.out.println("diff sound");
  }
}
class Dog extends Animal{
  void sound(){
    System.out.println("bark");
  }
}
class Cat extends Animal{
  void sound(){
    System.out.println("meow");
  }
}
public class polymorphism {
  public static void main(String[] args) {
    Animal a = new Cat();
    Dog d = new Dog();
    Cat c = new Cat();
    a.sound();
    d.sound();
    c.sound();

  }
}
