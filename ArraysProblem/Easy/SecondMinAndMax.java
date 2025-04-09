package ArraysProblem.Easy;
import java.util.*;
public class SecondMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && max != arr[i]) secondMax = arr[i];

            if(arr[i] < min)
            {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && min != arr[i]) secondMin = arr[i];
        }
        System.out.println("Second Min value : "+secondMin+"\nSecond Max value : "+secondMax);
    }
}
