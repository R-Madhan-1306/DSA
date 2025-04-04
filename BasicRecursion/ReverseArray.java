package BasicRecursion;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        obj.close();
        reverseArray(arr , 0, n-1);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int[] arr , int start , int end)
    {
        if(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }
}
