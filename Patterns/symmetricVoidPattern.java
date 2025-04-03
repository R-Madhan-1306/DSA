package Patterns;
import java.util.*;
class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < 2 * n; i++) {
            int stars = n - Math.min(i, 2 * n - i - 1); 
            int spaces = 2 * Math.min(i, 2 * n - i - 1); 

            // Print left side stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // Print middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print right side stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
