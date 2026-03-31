package day8;
class sum{
  int add(int a,int b){
    System.out.println(a+b);
    return a+b;
  }
  int add(int a,int b,int c){
    System.out.println(a+b+c);
    return a+b+c;
  }
}
public class methodoverloading {
  public static void main(String[] args) {
    sum s = new sum();
    s.add(1,2);
    s.add(1,2,3);
  }
}
