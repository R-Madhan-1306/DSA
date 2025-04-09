package ArraysProblem.Easy;
import java.util.*;
public class LongestSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int count = 0;
        int maxCount = 0;
        int sum;
        for (int i = 0; i < n; i++) {
            sum =0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k) {
                    count = j - i + 1;
                    maxCount = Math.max(maxCount, count);
                }
                if(sum > k) break;
            }
        }
        System.out.println(maxCount);
        
    }
}
