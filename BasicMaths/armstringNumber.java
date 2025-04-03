package BasicMaths;
import java.util.*;
public class armstringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = n;
        int sum =0;
        int size = (int)(Math.log10(num)+1);
        while(n>0)
        {
            int rem = n%10;
            sum += Math.pow(rem , size);
            n/=10;
        }

        System.out.println(sum == num ? "Armstrong Number" : "Not Armstrong Number");
    }
}
