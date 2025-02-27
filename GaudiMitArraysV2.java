import java.util.Scanner;

public class GaudiMitArraysV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Um wie viel verschieben?");
        int howmuch = sc.nextInt();

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] a = s.toCharArray();
        howmuch %= 26;
        for (int i = 0; i < a.length; i++) {
            a[i] -= howmuch;
            if (a[i] < 'A') {
                a[i] += 26;
            } else if (a[i] > 'Z') {
                a[i] -= 26;
            }
        }
        System.out.println(a);
    }
}
