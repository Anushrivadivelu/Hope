import java.util.Scanner;

public class subwaysurfs {
  public static void main(String[] args) {
    System.out.println("------SUBWAY SURFS------");
    Scanner sc = new Scanner(System.in);
    char key = sc.next().charAt(0);
    switch(Character.toUpperCase(key)){
      case 'S':
        System.out.println("START");
        break;
      case 'R':
        System.out.println("MOVE RIGHT");
        break;
      case 'L':
        System.out.println("MOVE LEFT");
        break;
      case 'J':
        System.out.println("JUMP");
        break;
      case 'D':
        System.out.println("ROLL DOWN/");
        break;
      case 'A':
        System.out.println("ACTIVATE HOVERBOARD");
        break;
      case 'P':
        System.out.println("PAUSE/RESUME GAME");
        break;
      case 'E':
        System.out.println("EXIT");
        break;
      default:
        System.out.println("INVALID KEY!");
    }
  }
}
