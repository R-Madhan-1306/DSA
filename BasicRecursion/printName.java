package BasicRecursion;
import java.util.*;

public class printName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        sc.close();
        print(1, n, str);

    }

    public static void print(int i, int n, String str)
    {
        if(i>n) return;
        System.out.print(str+" ");
        print(i+1, n, str);
    }
}
