package day5;

public class stringbuilder {
  public static void main(String[] args) {
    //StringBuilder
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.toString());
    sb.append("world");
    System.out.println(sb);
    //StringBuffer
    StringBuffer s = new StringBuffer("hello");
    System.out.println(s.toString());
    s.append("world");
    System.out.println(s);
  }
}
