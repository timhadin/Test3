import java.util.Arrays;
import java.util.Scanner;
public class Test3_no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        System.out.println("3개 문자열을 입력하세요.");

        for (int i = 0; i < 3; i++) {
            str[i] = scanner.nextLine();
        }

        System.out.print(str[0] + " " + str[1] + " " + str[2]);
    }
}