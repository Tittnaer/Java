import java.util.Scanner;
public class BetrunkenV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viel bier hast du getrunken?");
        int a = sc.nextInt();
        System.out.println("Wie viele shots hast du getrunken?");
        int b = sc.nextInt();

        if (a+b==0){
            System.out.println("Gar nicht betrunken.");
        } else if (a+b<=2) {
            System.out.println("Leicht betrunken.");
        } else if (a<=6 && b==0) {
            System.out.println("Betrunken.");
        }
        else{
            System.out.println("Hoffnungslos betrunken.");
        }
    }
}
