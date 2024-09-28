public class Test3_no6 {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];

        int value = 11;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = value;
                    value++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "번째 2차원 배열");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}