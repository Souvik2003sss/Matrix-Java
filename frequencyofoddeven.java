public class frequencyofoddeven {
    public static void main(String[] args) {
        int i, j, countodd = 0, counteven = 0;
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] % 2 == 0)
                    counteven++;
                else
                    countodd++;
            }
        }
        System.out.println("Frequency of odd numbers: " + countodd);
        System.out.println("Frequency of even numbers: " + counteven);

    }

}
