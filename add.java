class add {
    public static void main(String[] args) {
        // creating two matrix
        int[][] a = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int[][] b = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

        // creating another matrix to store the sum of two matrix
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }

    }
}