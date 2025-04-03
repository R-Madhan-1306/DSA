package BasicMaths;
import java.util.*;
public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b , a%b);
    }

    public static int lcm(int a, int b){
        return ((a/gcd(a,b))*b);
    }
}
