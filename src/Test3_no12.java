import java.util.Scanner;
import java.util.Random;

class Test3_no12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] dayKorean = { "일", "월", "화", "수", "목", "금", "토" };
        String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

        System.out.println("요일명을 영어 소문자로 입력하시오.");

        int retry;
        int last = -1;

        do {
            int day;
            do {
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            while (true) {
                System.out.print(dayKorean[day] + "요일:");
                String s = sc.nextLine();

                if (s.equals(dayEnglish[day])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다. 다시 한번? 1. Yes / 2. No : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}