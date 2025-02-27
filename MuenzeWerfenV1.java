import java.util.Random;

public class MuenzeWerfenV1 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean kopf = r.nextBoolean();
        if (kopf) {
            System.out.println("Die Muenze ist auf Kopf gelandet!");
        } else {
            System.out.println("Die Muenze ist auf Zahl gelandet!");
        }
    }
}
