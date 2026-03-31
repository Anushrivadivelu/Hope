package day9;
interface employee{
  void salary();
}
interface payement{
  void payprocess();
}
class Fulltime implements employee,payement{
  public void salary(){
    System.out.println("salary for fulltime : 50000");
  }
  public void payprocess(){
    System.out.println("credit");
  }
}
class Parttime implements employee,payement{
  public void salary(){
    System.out.println("salary for parttime : 100000");
  }
  public void payprocess(){
    System.out.println("credit");
  }
}
public class scenario1{
  public static void main(String[] args) {
    employee e = new Fulltime();
    e.salary();
    payement p = new Parttime();
    p.payprocess();

  }
}