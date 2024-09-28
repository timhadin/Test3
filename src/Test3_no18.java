import java.util.Random;
import java.util.Scanner;

class Test3_no18 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = 1 + rand.nextInt(10);

        for (int i = 1; i < n; i++) {
            do {
                arr[i] = 1 + rand.nextInt(10);
            } while(arr[i] == arr[i - 1]);
        }
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + arr[i]);
    }
}