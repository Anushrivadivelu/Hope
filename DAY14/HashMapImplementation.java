package DAY14;

import java.util.*;
public class HashMapImplementation {
  public static void main(String[] args) {
    String s = "helloworld";
    HashMap<String,Integer> map = new HashMap<>();
    map.put("ab",0);
    map.put("bc",1);
    //Entry set
    for(Map.Entry<String,Integer> entry :  map.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
    
  }
}
