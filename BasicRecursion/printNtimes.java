package BasicRecursion;
import java.util.*;
public class printNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }

    public  static void print(int n)
    {
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }
}
