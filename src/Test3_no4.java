public class Test3_no4 {
    public static void main(String[] args) {

        int a[][] = {{2, 3, 4}, {3, 2, 1}};
        int b[][] = {{1, 2, 3}, {-4, -2, 1}};
        int[][] c = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("두 행렬의 합:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}