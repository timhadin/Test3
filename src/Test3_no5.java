import java.util.Scanner;
public class Test3_no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dnum 배열의 길이:");
        int num = scanner.nextInt();

        double[] dnum = new double[num];
        double sum = 0;
        double avg = 0;

        System.out.print("초기화하지 않은 dnum[]의 값:");
        for (int i = 0; i < num; i++) {
            dnum[i] = 0.0;
            System.out.print(dnum[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print("dnum[" + i + "] 번째 데이터 입력 : ");
            dnum[i] = scanner.nextDouble();
            sum += dnum[i];
            avg = sum / num;
        }
        System.out.printf("배열의 합은 %.1f입니다.%n", sum);
        System.out.printf("배열값의 평균은 %.1f입니다.%n", avg);
    }
}