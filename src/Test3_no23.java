class Test3_no23 {
    public static void sum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10의 합계 : " + sum);
    }
    public static void main(String[] args) {
        sum();
    }
}