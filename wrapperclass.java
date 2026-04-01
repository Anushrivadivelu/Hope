package day11;

public class wrapperclass {
  public static void main(String[] args) {
    int a =10;
    System.out.println(a);
    Integer b = Integer.valueOf(a);
    System.out.println(b);
    System.out.println(a==b);
    System.out.println(b.hashCode());
    Character c = 'b';
    System.out.println(c);
    System.out.println(c.hashCode());
    char ch = c.charValue();
    System.out.println(ch);
  }
}                                                                        