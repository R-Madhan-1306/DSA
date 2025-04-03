package Patterns;
import java.util.*;

class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int size = 2 * n - 1; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = n - Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
