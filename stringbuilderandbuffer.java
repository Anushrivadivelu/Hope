package task4;

public class stringbuilderandbuffer {
  public static void main(String[] args) {
    //STRING BUILDER
    StringBuilder sb = new StringBuilder("Good Morning");
    sb.append("!");
    System.out.println(sb);
    sb.insert(5,"Good ");
    System.out.println(sb);
    sb.replace(0,4," Bad");
    System.out.println(sb);
    sb.delete(0,4);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    
    // STRING BUFFER
    StringBuffer s = new StringBuffer("Good Morning");
    s.append("@");
    System.out.println(sb);
    s.insert(5,"Night");
    System.out.println(sb);
    s.replace(0,4," Great");
    System.out.println(sb);
    s.delete(0,4);
    System.out.println(sb);
    s.reverse();
    System.out.println(sb);
  }
}
