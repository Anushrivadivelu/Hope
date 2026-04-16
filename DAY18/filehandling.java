package day18;

import java.io.FileWriter;

public class filehandling {
  public static void main(String[] args) {
    try{
      FileWriter writer = new FileWriter("hope_batch1.txt");
      writer.write("welcome");
      writer.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
