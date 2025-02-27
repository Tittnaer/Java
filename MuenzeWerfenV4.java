import java.util.Scanner;
import java.util.Random;

public class MuenzeWerfenV4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int k;
        int z;
        boolean ja;

        k = 0;
        z = 0;
        do {

            do {
                System.out.println("Wie oft soll die Muenze geworfen werden?(INSGESAMT UNGERADE)");
                a = sc.nextInt();
            } while (a < 1 || a > 10 || (k + z + a) % 2 == 0);


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

            System.out.println("Passt das Ergebnis?");
            ja = sc.nextBoolean();
        } while (!ja);

        if (k < z) {
            System.out.println("Stefan bekommt das Ticket.");
        } else if (k == z) {
            System.out.println("Unentschieden!");
        } else {
            System.out.println("Ich bekomme das Ticket.");
        }


    }
}