import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char ch = sc.next().charAt(0);
    switch(ch){
      case '+':
        System.out.println("add: "+ (a+b));
        break;
      case '-':
        System.out.println("sub: "+ (a-b));
        break;
      case '*':
        System.out.println("mul: "+ (a*b));
        break;
      case '/':
        if(b==0) System.out.println("cannot divide by 0");
        else System.out.println("div: "+ (a/b));
        break;
      case '%':
        if(b==0) System.out.println("cannot mod by 0");
        else System.out.println("mod: "+ (a%b));
        break;
      default:
        System.out.println("invalid operator");
    }
    sc.close();
  }
}
