package Patterns;
import java.util.*;

public class reverseLetterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(char i = (char) ('A'+n-1); i >= 'A'; i--)
        {
            for(char j = 'A'; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
