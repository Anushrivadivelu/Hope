package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamprint{
  public static void main(String[] args) {
    List<Integer> lis = new ArrayList<>();
    lis = Arrays.asList(1,2,3,4,5);
    System.out.println(lis.stream().filter(i->i%2==1).map(i->i*i).reduce(0,Integer::sum));
    //lis.stream().filter(i->i%2==1).map(i->i*i).reduce(0,Integer::sum).forEach(System.out::println);
    // .reduce(0,(a,b)->a+b); - comparator  
  }
}