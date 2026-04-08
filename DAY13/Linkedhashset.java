package day13;

import java.util.LinkedHashSet;

public class Linkedhashset {
  public static void main(String[] args) {
    LinkedHashSet<String> s = new LinkedHashSet<>();
    s.add("hope");
    System.out.println(s);
    s.add("batch1");
    System.out.println(s);
    s.add("anu");
    s.add("anusurya");
    s.add(null);
    System.out.println(s);
  }
}
