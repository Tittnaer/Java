import java.util.Scanner;

public class GaudiMitStatistik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gb = 0;
        int kb = 0;
        int sz = 0;
        int z = 0;
        System.out.println("Welchen Text willst du eingeben?");
        char[] text = sc.nextLine().toCharArray();

        for (int i = 0; i < text.length; i++) {
            char c = text[i];
            if (c >= 'a' && c <= 'z') {
                kb++;
            } else if (c >= 'A' && c <= 'Z') {
                gb++;
            } else if (c >= '0' && c <= '9') {
                z++;
            } else {
                sz++;
            }
        }
        System.out.println("Es wurden " +kb+" Kleinbuchstaben ausgegebn");
        System.out.println("Es wurden " +gb+" Grossuchstaben ausgegebn");
        System.out.println("Es wurden " +z+" Zahlen ausgegebn");
        System.out.println("Es wurden " +sz+" sonderzeichen ausgegebn");
    }
}

