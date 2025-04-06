package BasicHashing;
import java.util.*;


public class FrequencyCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        obj.close();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
