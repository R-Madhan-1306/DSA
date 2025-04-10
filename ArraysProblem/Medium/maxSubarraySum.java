package ArraysProblem.Medium;

import java.util.*;

public class maxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int start =0;
        int end =0;
        int tempStart = 0;
        int sum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<n;i++)
        {
            sum += arr[i];
            
            if(sum > maxSum){
                maxSum = sum;
                start = tempStart;
                end  = i;
            }
            if(sum < 0)
            {
                sum = 0;
                tempStart =i+1;
            }
        }

        System.out.println("maxSum = " + maxSum + " start = " + start + " end = " + end);
    }
}