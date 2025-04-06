package Sorting;
import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        quickSorting(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSorting(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);
            quickSorting(arr, low, pivot-1);
            quickSorting(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
    return i+1;
    }
}
