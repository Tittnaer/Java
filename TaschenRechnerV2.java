import java.util.Random;
import java.util.Scanner;

public class TaschenRechnerV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein:");
        int a = sc.nextInt();
        System.out.println("Gib die zweite Zahl ein:");
        int b = sc.nextInt();

        System.out.println("Gib den Operator (+, -, *, /, %) ein:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (double) a / b);
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a % b));
                break;
            default:
                System.out.println("Es wurde kein richtiger Operator angegeben");
        }
    }
}
