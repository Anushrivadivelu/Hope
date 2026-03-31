package day9;
import java.util.Scanner;

public class Leetcode_6 {
  public static String convert(String s, int numRows) {
    if(s.length()<=numRows || numRows == 1){
            return s;
        }
        int row =0;
        boolean flag = false;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }
       for(char c : s.toCharArray()){
        rows[row].append(c);
        if(row==0 || row==numRows-1){
            flag =!flag;
        }row+=flag?1:-1;
       } 
        StringBuilder res = new StringBuilder();
        for(StringBuilder r : rows){
            res.append(r);
        }
        return res.toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    String s = sc.next();
    System.out.println(convert(s,row));
    sc.close();
  }
}
