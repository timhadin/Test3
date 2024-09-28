import java.util.Scanner;

class Test3_no21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("a = {");
        if (n >= 2)
            for (int i = 0; i < n - 1; i++)
                System.out.print(arr[i] + ", ");
        if (n >= 1)
            System.out.print(arr[n - 1]);
        System.out.print("}");
    }
}