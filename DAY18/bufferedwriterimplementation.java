package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferedwriterimplementation {
  public static void main(String[] args) {
    try{
      BufferedWriter writer = new BufferedWriter(new FileWriter("null"));
      writer.write("hello");
      writer.newLine();
      writer.write("world");
      writer.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
