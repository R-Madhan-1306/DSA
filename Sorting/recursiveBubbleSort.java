package Sorting;
import java.util.*;
public class recursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        recursiveBubbleSorting(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void recursiveBubbleSorting(int[] arr,  int r)
    {
        if( r == 1) return;
        for(int i=0;i<=r-2;i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        recursiveBubbleSorting(arr, r-1);
    }
}
