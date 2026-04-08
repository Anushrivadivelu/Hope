package DAY14;
import java.util.*;

public class TreeSetImplementation {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(1);
    set.add(0);
    set.tailSet(5);
    set.headSet(5);
    System.out.println(set);
  }
}
