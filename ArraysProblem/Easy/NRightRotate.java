package ArraysProblem.Easy;
import java.util.*;
public class NRightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
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
            temp[i] = arr[i+n-k];
        }
        for(int i=0;i<n-k;i++)
        {
            arr[i+k] = arr[i];
        }
        for(int i=0;i<k;i++)
        {
            arr[i] = temp[i];
        }
    }
}
