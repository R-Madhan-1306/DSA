package BasicRecursion;
import java.util.*;

public class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(FactorialValue(n));
    }

    public static int FactorialValue(int n )
    {
        if( n== 0 || n == 1) return 1;
    return n*FactorialValue(n-1);
    }
}