package Patterns;
import java.util.*;
public class symmetricButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=1;i<n*2;i++)
        {
            int stars = Math.min(2*n-i, i);
            int spaces = 2*(n-stars);

            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
