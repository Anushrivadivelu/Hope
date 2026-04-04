package day12;

import java.util.LinkedList;

public class linkedlist {
  public static void main(String[] args) {
    LinkedList<String> lis = new LinkedList<>();
    lis.add("A");
    lis.add("B");
    lis.add("C");
    lis.addFirst("start");
    System.out.println(lis);
    lis.remove(2);
    System.out.println("B is disqualified");
    System.out.println(lis);
    lis.addLast("finish");
    System.out.println("won");
  }
}
