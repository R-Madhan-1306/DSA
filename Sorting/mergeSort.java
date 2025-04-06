package Sorting;
import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = obj.nextInt();
        
        mergeSortFunction(arr, 0 , arr.length -1 );

        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        obj.close();
    }    

    public static void mergeSortFunction(int[] arr , int l, int r)
    {
        if(l < r){
            int mid = (l+r)/2;

            mergeSortFunction(arr, l, mid);

            mergeSortFunction(arr, mid+1, r);

            merge(arr, l, mid, r);
        }

    }

    public static void merge(int[] arr , int l, int mid , int r)
    {
        int n = mid-l+1;
        int m  = r - mid;
        int[] L = new int[n];
        int[] R = new int[m];

        for(int i=0;i<n;i++)
            L[i] = arr[l+i];
        for(int j=0;j<n;j++)
            R[j] = arr[mid+1+j];

        int i=0, j = 0, k = l;

        while (i < n && j < m) {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n)
        {
            arr[k] = L[i];
            i++;k++;
        }
        while(j < m)
        {
            arr[k] = R[j];
            j++;k++;
        }

    }
}
