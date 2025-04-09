package ArraysProblem.Easy;
import java.util.*;
public class NLeftRotate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        obj.close();
        ArrayRotate(arr,n,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void ArrayRotate(int[] arr,int n,int k)
    {
        k = k%n;

        int temp[] = new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            arr[i] = arr[i+k];
        }
        for(int i = n-k; i<n;i++)
        {
            arr[i] = temp[i-n+k];
        }
    }
}
