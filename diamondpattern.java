package task8;
class A{
  void showA(){
    System.out.println("method from A");
  }
}
interface B{
  void showB();
}
interface C{
  void showC();
}
class D extends A implements B,C{
  public void showB(){
    System.out.println("interface B");
  }
  public void showC(){
    System.out.println("interface C");
  }
  void showD(){
    System.out.println("method of D");
  }
}
public class diamondpattern {
  public static void main(String[] args) {
    D obj = new D();
    obj.showA();
    obj.showB();
    obj.showC();
    obj.showD();
    A a = new D();
    a.showA();
    B b = new D();
    b.showB();
    C c = new D();
    c.showC();
  }
}
