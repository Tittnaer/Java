public class PrimBis1000 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            boolean prim = true;
            for (int x = 2; x < n && prim; x++) {
                if (n % x == 0) {
                    // keine Primzahl -> beende innere for-Schleife
                    prim = false;
                }
            }
            if (prim)
                System.out.println("[" + n + "]");
        }
    }
}