import java.util.*;
public class LongSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max=0;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                if(sum == 0)
                {
                    max = Math.max(max, j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
