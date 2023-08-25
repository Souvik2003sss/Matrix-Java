public class Equalmatrix {
    public static void main(String[] args) {
        boolean flag = true;
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] B = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int row1 = A.length;
        int col1 = A[0].length;
        int row2 = B.length;
        int col2 = B[0].length;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] != B[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("Matrix are equal");
        else
            System.out.println("Matrix are not equal");
    }

}
