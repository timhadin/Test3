import java.util.Scanner;

public class Test3_no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] a = new float[10];
        float sum = 0;
        float avg = 0;


        System.out.println("과목 점수를 입력해주세요.");

        for (int i = 0; i < a.length; i++) {
            float x = scanner.nextFloat();
            sum += x;
            avg += x;
        }
        System.out.printf("합계: %.13f%n", sum);
        System.out.printf("평균: %.2f", avg / a.length);
    }
}