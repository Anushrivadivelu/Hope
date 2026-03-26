package day7;

public class hierarchical {
  public static void main(String[] args) {
    Son s = new Son();
    Daughter d = new Daughter();
    Father f = new Father();
    s.land();
    s.house();
    s.bike();
    d.land();
    d.car();
    f.land();
    f.house();
  }
}
class Grandfather{
  void land(){
    System.out.println("Owns the land");
  }
}
class Father extends Grandfather{
  void house(){
    System.out.println("Owns the house");
  }
}
class Son extends Father{
  void bike(){
    System.out.println("Has a bike");
  }
}
class Daughter extends Father{
  void car(){
    System.out.println("Has a car");
  }
}
