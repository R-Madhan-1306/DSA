package BasicRecursion;
import java.util.*;
public class sumOf1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(SumValue(n));
    }

    public static int SumValue(int n){
        if(n == 0) return n;

        return n + SumValue(n-1);
    }
}
