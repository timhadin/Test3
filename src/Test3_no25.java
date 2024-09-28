class Test3_no25 {
    class Calculation {
        int x = 10;
        int y = 20;

        public void addition() {
            int result = x + y;
            System.out.println("두 수의 덧셈 : " + result);
        }

        public void subtraction() {
            int result = y - x;
            System.out.println("두 수의 뺄셈 : " + result);
        }
    }
    class Inheritance01 extends Calculation {
        public void multiplication() {
            int result = x * y;
            System.out.println("두 수의 곱셈 : " + result);
        }
    }

    public static void main(String[] args) {
        Test3_no25 t = new Test3_no25();
        Inheritance01 obj = t.new Inheritance01();

        obj.addition();
        obj.subtraction();
        obj.multiplication();
    }
}