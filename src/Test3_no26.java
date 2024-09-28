class Test3_no26 {
    class CalculateSquare {
        public int square(int length, int width) {
            int area = length * width;
            System.out.println("가로:" + length + ", 세로:" + width + " 사각형의 넓이는 " + area);
            return area;
        }
        public double square(double length, double width) {
            double area = length * width;
            System.out.println("가로:" + length + ", 세로:" + width + " 사각형의 넓이는 " + area);
            return area;
        }
    }
    public static void main(String[] args) {
        Test3_no26 t = new Test3_no26();
        CalculateSquare obj = t.new CalculateSquare();

        obj.square(10, 5);
        obj.square(2.5, 4.5);
    }
}