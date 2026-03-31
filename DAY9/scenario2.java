package day9;
interface payment{
  void pay(int amount);
}
class credit implements payment{
  public void pay(int amount){
    System.out.println("Mode of payment: CREDIT");
    System.out.println("Paid: "+ amount);
  }
}
class debit implements payment{
  public void pay(int amount){
    System.out.println("Mode of payment: DEBIT");
    System.out.println("Paid: "+ amount);
  }
}
class cash implements payment{
  public void pay(int amount){
    System.out.println("Mode of payment: CASH");
    System.out.println("Paid: "+ amount);
  }
}
class UPI implements payment{
  public void pay(int amount){
    System.out.println("Mode of payment: UPI");
    System.out.println("Paid: "+ amount);
  }
}
public class scenario2 {
  public static void main(String[] args) {
     payment p = new credit();
     p.pay(1000);
     payment b = new debit();
     p.pay(2000);
     payment c = new cash();
     p.pay(500);
     payment d = new UPI();
     p.pay(1500);
  }
}
