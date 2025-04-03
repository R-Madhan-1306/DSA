package BasicMaths;
import java.util.*;
public class numberReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int num = n;
        int rev =0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);

        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()));

        System.out.println((new StringBuffer(String.valueOf(num)).reverse().toString()));
    }
}
