class Test3_no28 {
    class Add {
        public Add(int a, int b) {
            System.out.println("일반 생성자 Add(int a, int b) 호출");
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        public Add(double a, double b) {
            System.out.println("일반 생성자 Add(double a, double b) 호출");
            double result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        public Add(int a, double b) {
            System.out.println("일반 생성자 Add(int a, double b) 호출");
            double result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
    }
    public static void main(String[] args) {
        Test3_no28 t = new Test3_no28();

        Add obj1 = t.new Add(1,2);
        Add obj2 = t.new Add(2.4, 6.2);
        Add obj3 = t.new Add(3, 5.5);
    }
}