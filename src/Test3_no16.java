import java.util.Scanner;
import java.util.Random;

class Test3_no16 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            int idx1 = rand.nextInt(n);
            int idx2 = rand.nextInt(n);
            int tmp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = tmp;
        }

        System.out.println("요소를 섞었습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}