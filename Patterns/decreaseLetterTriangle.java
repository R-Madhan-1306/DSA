package Patterns;
import java.util.*;
public class decreaseLetterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(char i = (char) ('A'+n-1); i >= 'A'; i--)
        {
            for(char j = i; j <= 'A'+n-1; j++) 
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
