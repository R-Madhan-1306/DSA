package ArraysProblem.Medium;
import java.util.*;
public class LongestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(LongestSequenceVal(arr));
    }

    public static int LongestSequenceVal(int[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int maxCount = Integer.MIN_VALUE;
        int c =1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]-1 == arr[i] )
            {
                c+=1;
            }
            else{
                c =1;
            }
            System.out.println(c);
            maxCount = Math.max(maxCount , c);
        }
    return maxCount;
    }
}
