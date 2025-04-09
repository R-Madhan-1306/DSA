package ArraysProblem.Easy;
import java.util.*;
public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        int maxCount= 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1) count++;
            else count = 0;
            maxCount = Math.max(maxCount, count);
        }

        System.out.println("Maximum Count of Ones:"+maxCount);
    }
}
