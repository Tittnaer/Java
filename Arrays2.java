public class Arrays2 {
    public static void main(String[] args) {

        boolean[] a = new boolean[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
            System.out.println(a[i]);
            i++;
            a[i] = false;
            System.out.println(a[i]);



        }
    }
}
