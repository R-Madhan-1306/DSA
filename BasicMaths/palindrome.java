package BasicMaths;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.print(ispalindrome(n) ? "Palindrome" : "Not Palindrome");
    }
    public static boolean ispalindrome(String n) {
        int i = 0, j = n.length() - 1;
        while(i<j)
        {
            if(n.charAt(i)!=n.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
