package TASK6;
import java.util.*;
class Bedroom{
  int b;
  Bedroom(int b){
    this.b=b;
    System.out.print("with "+b+" bedroom, ");
  }
}
class Kitchen{
  int k;
  Kitchen(int k){
    this.k=k;
    System.out.print("with kitchen, ");
  }
}
class Washroom{
  int w;
  Washroom(int w){
    this.w= w;
    if(w==0) System.out.print("public washroom, ");
    else System.out.print("with attached washroom, ");
  }
}
class Dinning_hall{
  int d;
  Dinning_hall(int d){
    this.d=d;
    if(d==0) System.out.print("dinning hall, ");
    else System.out.print("attached dinning hall, ");
  }
} 
class Hall{
  int h;
  Hall(int h){
    this.h=h;
    System.out.print("with hall, ");
  }
}
class Playground{
  int p;
  Playground(){
    System.out.print("and public playground");
  }
}
public class Apartment{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==1){
      System.out.println("1BHK");
      Bedroom b = new Bedroom(1);
      Kitchen k = new Kitchen(1);
      Washroom w = new Washroom(0);
      Dinning_hall d = new Dinning_hall(0);
      Hall h = new Hall(1);
      Playground p = new Playground();
    }
    if(n==2){
      System.out.println("2BHK");
      Bedroom b = new Bedroom(2);
      Kitchen k = new Kitchen(1);
      Washroom w = new Washroom(1);
      Dinning_hall d = new Dinning_hall(1);
      Hall h = new Hall(1);
      Playground p = new Playground();
    }
    if(n==4){
      System.out.println("4BHK");
      Bedroom b = new Bedroom(4);
      Kitchen k = new Kitchen(1);
      Washroom w = new Washroom(1);
      Dinning_hall d = new Dinning_hall(1);
      Hall h = new Hall(1);
      Playground p = new Playground();
    }
  }
}