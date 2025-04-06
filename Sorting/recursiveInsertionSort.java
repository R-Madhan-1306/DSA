package Sorting;
import java.util.*;
public class recursiveInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        recursiveInsertionSorting(arr,0, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void recursiveInsertionSorting(int[] arr, int i,int n)
    {
        if(i == n) return;
        int j =i;
        while (j>0 && arr[j-1]>arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
    recursiveInsertionSorting(arr, i+1, n);
    }
    
}
