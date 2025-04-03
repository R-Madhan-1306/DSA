package Patterns;
import java.util.*;
public class alphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print((char)('A'+j));
            }
            for(int j=i-2;j>=0;j--)
            {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
