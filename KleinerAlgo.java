import java.util.Scanner;

public class KleinerAlgo {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = a+b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie oft soll es wiederholen?");
        int counter = sc.nextInt();

        for (int i= 0; i < counter; i++){
            System.out.println(a+"+"+b+"="+c);
            a = b;
            b = c;
            c = a + b;

        }

    }
}
