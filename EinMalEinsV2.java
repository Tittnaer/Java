import java.util.Scanner;
public class EinMalEinsV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welche Zahl soll multipilizert werden?");
        int j = sc.nextInt();
        for (int i =1; i<11; i++){
            System.out.println(i + "*"+j+"="+i*j);
        }
    }
}
