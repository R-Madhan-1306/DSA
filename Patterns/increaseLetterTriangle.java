package Patterns;
import java.util.*;
public class increaseLetterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(char i ='A'; i <= 'A'+n-1; i++)
        {
            for(char j = 'A'; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
