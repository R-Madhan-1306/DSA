package BasicRecursion;
import java.util.*;
public class printNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(n);
    }

    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
        
    }
}
