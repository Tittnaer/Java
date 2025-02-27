import java.util.Random;

public class GaudiMitArrays {
    public static void main(String[] args) {

        //int[] a = {0,1,2,3,4,5,6,7,8,9};
        Random r = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);

        }
    }
}
