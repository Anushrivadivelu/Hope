import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int rows=1;rows<=n;rows++){
      for(int cols=1;cols<=n-rows;cols++){
        System.out.print(" ");
      }
      for(int star=1;star<=rows*2-1;star++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int rows=n;rows>=1;rows--){
      for(int cols=1;cols<=n-rows;cols++){
        System.out.print(" ");
      }
      for(int star=1;star<=rows*2-1;star++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
output:
n = 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
