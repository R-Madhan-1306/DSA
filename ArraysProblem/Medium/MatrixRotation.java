package ArraysProblem.Medium;

import java.util.Scanner;

public class MatrixRotation {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];
        int row = 0;
        for (int i = 0; i < n; i++) {
            int col = 0;
            for (int j = m - 1; j >= 0; j--) {
                res[row][col] = matrix[j][i];
                col++;
            }
            row++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
