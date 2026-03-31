package day9;
interface payement{
  void pay(int amount);
}
class credit implements payement{
  public void pay(int amount){
    System.out.println("Mode of payemnt: CREDIT");
    System.out.println("Paid: "+ amount);
  }
}
class debit implements payement{
  public void pay(int amount){
    System.out.println("Mode of payemnt: DEBIT");
    System.out.println("Paid: "+ amount);
  }
}
class cash implements payement{
  public void pay(int amount){
    System.out.println("Mode of payemnt: CASH");
    System.out.println("Paid: "+ amount);
  }
}
class UPI implements payement{
  public void pay(int amount){
    System.out.println("Mode of payemnt: UPI");
    System.out.println("Paid: "+ amount);
  }
}
public class scenario2 {
  public static void main(String[] args) {
    //payement c = new credit();
    

  }
}
