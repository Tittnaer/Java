import java.util.Random;

public class GaudiMitStatistikV2 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(101);
            System.out.println("Originial Array :" + a[i]);
        }
        int temp;
        System.out.println("-------------------");
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] < a[k]) {
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
            System.out.println("Sorted Array :" + a[j]);
        }

    }
}