import java.util.Random;
import java.util.Scanner;

class Test3_no14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] monthString = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };

        System.out.println("해당 월의 영어 단어를 입력하세요.");
        System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

        int retry;
        int last = -1;

        do {
            int month;
            do {
                month = rand.nextInt(12);
            } while (month == last);
            last = month;

            while (true) {
                System.out.print((month + 1) + "월:");
                String s = sc.next();

                if (s.equals(monthString[month])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다. 다시 한번? 1. Yes / 2. No : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}