package ArraysProblem.Medium;
import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = Leaders(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] Leaders(int[] arr)
    {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        int max = arr[n-1];
        leaders.add(max);
        for(int i = n-2;i>=0;i--)
        {
            if(arr[i] > max)
            {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }

        int size = leaders.size();
        int[] ans = new int[size];
        int i=0;
        for(int num : leaders)
        {
            ans[i++] = num;
        }
    return ans;
    }
}
