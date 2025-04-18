package ArraysProblem.Medium;

import java.util.Scanner;

public class SubArrSumCnt {
    public static int subarraySum(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = subarraySum(nums, k);
        System.out.println(result);

        sc.close();
    }
}
