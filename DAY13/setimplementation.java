package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setimplementation {
  public static void main(String[] args) {
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    Integer a =145;
    set.add(a);
    set.add(122);
    set.add(121);
    System.out.println(set);
    System.out.println(set.contains(12));
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
