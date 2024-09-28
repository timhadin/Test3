class Test3_no22 {
    public static void calculate(double radius) {
        double pi = 3.14;
        double circumference = 2 * radius * pi;
        System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율");
        System.out.println("2 x " + radius + " x " + pi + " = " + circumference);
    }
    public static void main(String[] args) {
        calculate(4);
    }
}