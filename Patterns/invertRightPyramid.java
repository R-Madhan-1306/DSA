package Patterns;
import java.util.*;
public class invertRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=5;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
