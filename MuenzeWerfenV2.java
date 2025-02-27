import java.util.Scanner;
import java.util.Random;

public class MuenzeWerfenV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie oft soll die Muenze geworfen werden?");
        int a = sc.nextInt();

        int k = 0;
        int z = 0;


        for (int i = 1; i <= a; i++) {
            Random r = new Random();
            boolean kopf = r.nextBoolean();
            if (kopf) {
                System.out.println("Die Muenze ist auf Kopf gelandet!");
                k++;
            } else {
                System.out.println("Die Muenze ist auf Zahl gelandet!");
                z++;
            }
        }

        System.out.println("Summe kopf: " + k);
        System.out.println("Summe zahl: " + z);
        if (k < z) {
            System.out.println("Stefan bekommt das Ticket.");
        } else if (k == z) {
            System.out.println("Unentschieden!");
        } else {
            System.out.println("Ich bekomme das Ticket.");
        }


    }
}