import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        char g;
        if (marks >= 90) {
            g = 'A';
        } else if (marks >= 80) {
            g = 'B';
        } else if (marks >= 70) {
            g = 'C';
        } else if (marks >= 60) {
            g = 'D';
        } else if (marks >= 50) {
            g = 'E';
        } else {
            g = 'F';
        }
        System.out.println("GRADE : "+ g);
    }
}
