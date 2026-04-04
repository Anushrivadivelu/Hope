package day12;

import java.util.ArrayList;

public class arraylist {
  public static void main(String[] args) {
    ArrayList<Integer> lis = new ArrayList<>();
    lis.add(null);
    lis.add(10);
    lis.add(20);
    lis.add(0,15);
    lis.add(10);
    System.out.println(lis);

    lis.set(1,5);
    System.out.println(lis);

    lis.remove(1);
    System.out.println(lis);
    System.out.println(lis.contains(15));
    System.out.println(lis.contains(100));
    System.out.println(lis.size());
    System.out.println(lis.indexOf(0));
    System.out.println(lis.lastIndexOf(1));
    System.out.println(lis.isEmpty());
    lis.clear();
    System.out.println(lis.isEmpty());
  }
}
