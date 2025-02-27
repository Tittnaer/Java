import java.util.Scanner;

public class TestPrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        System.out.println("Welche Zahl willst du pruefen?");
        int n = sc.nextInt();
        for (int k = 2; k < n && !stop; k++){
            if (n % k== 0){
                stop = true;

            }
        }if (stop){
            System.out.println("Ist keine Primzahl");
        }else {
            System.out.println("Ist eine Primzahl");
        }
    }
}
