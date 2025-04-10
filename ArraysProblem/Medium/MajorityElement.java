package ArraysProblem.Medium;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > n/2)
            {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
