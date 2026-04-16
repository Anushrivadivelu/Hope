package day18;

import java.io.FileReader;

public class filereaderimplementation {
  public static void main(String[] args) {
    try{
      FileReader reader = new FileReader("hope_batch1.txt");
      int ch ;
      while((ch= reader.read())!=-1){ 
        System.out.println( (char)ch);
      }
      reader.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
