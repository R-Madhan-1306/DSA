package ArraysProblem.Medium;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();

        System.out.println(twoSum(arr, target));
    }

    public static String twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]+arr[j]==target) return i+" "+j;
            }
        }
    return "Target sum not found";
    }
}
