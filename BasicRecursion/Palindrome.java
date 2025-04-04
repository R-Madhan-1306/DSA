package BasicRecursion;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(String str)
    {
        int i=0 , e = str.length() -1 ;
        while(i < e)
        {
            if(str.charAt(e) != str.charAt(i)) return false;
            i++;
            e--;
        }
    return true;
    }
}
