package day18;

import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedreaderimplementation {
  public static void main(String[] args) {
    try{
      BufferedReader reader = new BufferedReader(new FileReader("null"));
      while(reader.ready()){
        System.out.println(reader.readLine());
      }
      reader.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
