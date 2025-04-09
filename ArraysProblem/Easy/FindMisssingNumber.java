package ArraysProblem.Easy;

import java.util.Scanner;

public class FindMisssingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = (n*(n+1))/2;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total +=arr[i];
        }
        System.out.println(sum - total);
    }
}
