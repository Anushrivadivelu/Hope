package day9;
interface A{
  void show();
}
interface B{
  void display();
}
class C implements A{
  public void show(){
    System.out.println("implements");
  }
}

public class interfaceexample {
  public static void main(String[] args) {
    A c= new C();
    c.show();
    //  B b = new C();
    
  }
}
