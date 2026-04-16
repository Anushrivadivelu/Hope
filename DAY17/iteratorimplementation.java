package day17;
import java.util.*;
public class iteratorimplementation {
  public static void main(String[] args) {
    List<Integer> lis  = new ArrayList<>();
    lis.add(15);
    lis.add(20);
    lis.add(25);
    lis.add(30);
    lis.add(35);
    Iterator<Integer> i = lis.iterator();
    while(i.hasNext()){
      if(i.next()%2==0) i.remove();
      else System.out.println(i.next());
    }
    //remove implementation
    List<Integer> l  = new ArrayList<>();
    l.add(15);
    l.add(20);
    l.add(25);
    l.add(30);
    l.add(35);
    for(Integer n : l){
      if(n%2==0){
        l.remove(n);
      }
    }
    System.out.println(l);
  }
}
