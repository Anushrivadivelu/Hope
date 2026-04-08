package day13;

import java.util.HashSet;
//import java.util.Set;

public class setimplementation {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    Integer a =145;
    set.add(a);
    set.add(122);
    set.add(121);
    System.out.println(set);
    System.out.println(set.contains(12));
  }
}
