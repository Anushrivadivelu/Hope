package day8;

public class banksystem {
  public static void main(String[] args) {
    Bank b = new Bank();
    b.deposit(500);
    b.withdraw(1000);
    b.balance();
  }
}
class Bank{
  private int balance;
  void deposit(int amount){
    balance+= amount;
    System.out.println("deposited: "+ amount);
  }void withdraw(int amount){
    if(amount<=balance){
      balance-=amount;
      System.out.println("withdrawn: "+ amount);
    } 
    else System.out.println("insufficient balance");
  }void balance(){
    System.out.println("balance: "+  balance);
  }
}
