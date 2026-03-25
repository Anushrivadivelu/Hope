package TASK6;

public class consructoroverloading {
  consructoroverloading(){
    System.out.println("parameterized with no arguments");
  }
  consructoroverloading(int i){
    System.out.println("paramterized with arguments"+i);
  }consructoroverloading(String s){
    System.out.println("paramterized with arguments"+s);
  }
  consructoroverloading(Boolean b){
    System.out.println("paramterized with arguments"+b);
  }
  public static void main(String[] args) {
    consructoroverloading c1 = new consructoroverloading();
    consructoroverloading c2 = new consructoroverloading(20);
    consructoroverloading c3 = new consructoroverloading("HEllo World");
    consructoroverloading c4 = new consructoroverloading(true);
  }
}
