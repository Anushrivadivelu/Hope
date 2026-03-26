package day7;

public class MultilevelInheritance2 {
  public static void main(String[] args) {
   // Car c = new Car();
    Electric_car e = new Electric_car();
    //c.car();
    //c.display();
    e.car();
    e.electric();
    e.display();
  }
    
}
class Transport{
  void display(){
    System.out.println("Transport");
  }
}

class Car extends Transport{
  void car(){
    System.out.println("CAR");
  }
}

class Electric_car extends Car{
  void electric(){
    System.out.println("Electric Car");
  }
}

