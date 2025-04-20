import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        obj.close();
        List<List<Integer>> res = ThreeSumArr(arr);
        for(List<Integer> nums : res)
        {
            System.out.print("[");
            for(int num : nums)
            {
                System.out.print(num+",");
            }
            System.out.print("]");
        }
    }

    public static List<List<Integer>> ThreeSumArr(int[] arr) {
        // Set<List<Integer>> res = new HashSet<>();
        // int n = arr.length;
    
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         for(int k=j+1; k<n; k++) {
        //             if(arr[i] + arr[j] + arr[k] == 0) {
        //                 List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
        //                 Collections.sort(triplet); 
        //                 res.add(triplet);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<arr.length-2;i++)
        {
            if(i>0 && arr[i] == arr[i-1]) continue;

            int l = i+1 , r = arr.length-1;

            while(l < r)
            {
                int sum = arr[i]+arr[l]+arr[r];
                if(sum == 0)
                {
                    res.add(Arrays.asList(arr[i] , arr[l],arr[r]));
                    
                    while(l < r && arr[l] == arr[l+1]) l++;
                    while(l<r && arr[r] == arr[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum < 0) l++;
                else r--;
            }
        }
    return res;
    }
    
}
