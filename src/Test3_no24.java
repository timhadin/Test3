class Test3_no24 {
    public static int max(int x, int y) {
        int result;
        if (x > y) {
            result = x;
        } else {
            result = y;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;

        int larger = max(x, y);

        System.out.println(x + "(와) " + y + "의 수 중 " + larger + "이 큽니다.");
    }
}