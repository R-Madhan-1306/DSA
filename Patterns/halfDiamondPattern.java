package Patterns;

import java.util.*;
public class halfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();
        sc.close();
        for(int i=1;i<=2*n-1;i++)
        {
            int stars = i;
            
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
