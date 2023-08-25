import java.util.*;

class print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value of[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}