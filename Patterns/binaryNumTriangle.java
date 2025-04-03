package Patterns;

import java.util.*;
public class binaryNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
   
        for(int i=1;i<=n;i++)
        {
            int s = (i%2 == 0) ? 1 : 0;
            for(int j=1;j<=i;j++)
            {
                s = (s == 0) ? 1 : 0;
                System.out.print( s+" ");
            }
            System.out.println();
        }
    }
}
