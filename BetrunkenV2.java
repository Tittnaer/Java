import java.util.Scanner;

public class BetrunkenV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Wie alt bist du?");
        int alter = sc.nextInt();
        System.out.println("Hast du einen Führerschein?");
        boolean Licence = sc.nextBoolean();
        System.out.println("Wie viel bier hast du getrunken?");
        int a = sc.nextInt();
        System.out.println("Wie viele shots hast du getrunken?");
        int b = sc.nextInt();

        if (alter >= 17 && a + b == 0 && Licence) {
            System.out.println("Du darfst Auto fahren.");
        } else if (alter >= 19 && a + b <= 2 && Licence) {
            System.out.println("Du darfst Auto fahren.");
        } else {
            System.out.println("Du darfst nicht Auto fahren.");
        }

        /*if (Licence && (alter >= 17 && a + b == 0 || alter >= 19 && a + b <= 2)) {
            System.out.println("Du darfst Auto fahren.");
        } else {
            System.out.println("Du darfst nicht Auto fahren.");
        }*/
    }
}
