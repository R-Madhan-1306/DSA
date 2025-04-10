package ArraysProblem.Medium;
import java.util.*;
public class maxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            buy = Math.min(buy , arr[i]);
            profit = Math.max(profit , arr[i] - buy);
        }
        System.out.println(profit);
    }
}
