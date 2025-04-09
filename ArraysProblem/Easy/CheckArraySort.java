package ArraysProblem.Easy;
import java.util.*;
public class CheckArraySort {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(isArraySortCheck(arr) ? "Array is sorted" : "Array is not sorted");
    }

    public static boolean isArraySortCheck(int[] arr) {
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i] > arr[i+1]) return false;
        }
    return true;
    }
}
