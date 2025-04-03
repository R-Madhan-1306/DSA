package BasicMaths;

import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =n;
        sc.close();
        int count = 0;
       while(num>0)
       {
           num = num/10;
           count++;
       }
       System.out.println(count);

       System.out.println(n == 0 ? 1 : (int)(Math.log10(Math.abs(n))+1));

       System.out.println(String.valueOf(n).length());
    }
}
