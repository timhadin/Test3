import java.util.Scanner;

public class Test3_no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] a = new float[2][2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("학생번호%d%n", i+1);
            System.out.print("국어점수 : ");
            float korean = scanner.nextInt();
            a[i][0] = korean;
            System.out.print("수학점수 : ");
            float math = scanner.nextInt();
            a[i][1] = math;
        }

        System.out.println("학생번호1");
        System.out.printf("국어:%.1f 수학:%.1f 평균:%.1f%n", a[0][0], a[0][1], (a[0][0] + a[0][1]) / 2);
        System.out.println("학생번호2");
        System.out.print("국어:" + a[1][0] + " " + "수학:" + a[1][1] + " " + "평균:" + ((a[1][0]+a[1][1])/2));
    }
}