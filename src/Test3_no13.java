import java.util.Random;
import java.util.Scanner;

class Test3_no13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
        String[] dayEnglish = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        System.out.println("요일명을 영어 소문자로 입력하시오.");

        int retry;
        int last = -1;

        do {
            int day;
            do {
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            int action;
            do {
                System.out.print(dayKorean[day] + "요일:");
                String s = sc.nextLine();

                if (s.equals(dayEnglish[day])) {
                    System.out.println("정답입니다.");
                    break;
                }
                System.out.println("틀렸습니다.");
                do {
                    System.out.print("어떻게 할까요? 1. 재입력 / 2. 정답 보기 : ");
                    action = sc.nextInt();
                } while (action != 1 && action != 2);
                if (action == 2)
                    System.out.println(dayKorean[day] + "요일은\"" + dayEnglish[day] + "\"입니다.");
            } while (action == 1);

            System.out.print("다시 한번? 1. Yes / 2. No : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}