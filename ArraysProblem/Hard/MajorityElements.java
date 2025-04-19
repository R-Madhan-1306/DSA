
import java.util.*;
public class MajorityElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        List<Integer> res = MajorityElementsRes(arr);
        for(int num : res)
        {
            System.out.print(num+" ");
        }
    }

    public static List<Integer> MajorityElementsRes(int[] arr)
    {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr)
        {
            freq.put(num , freq.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer ,Integer> entry : freq.entrySet())
        {
            if(entry.getValue() > (arr.length /3)) res.add(entry.getKey());
        }
    return res;
    }
}
