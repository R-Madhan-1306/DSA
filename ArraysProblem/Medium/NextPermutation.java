package ArraysProblem.Medium;

import java.util.*;
class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        nextPermutationArray(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void nextPermutationArray(int[] arr) {
        int n = arr.length;
        int i = n-2;
        while(i >= 0 && arr[i] >=arr[i+1]) {
            i--;
        }

        if(i >= 0)
        {
            int j = n-1;
            while(arr[j] <= arr[i])
            {
                j--;
            }
            swap(arr , i, j);
        }
    reverse(arr, i+1 , n-1);
    }

    public static void swap(int[] arr , int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end)
    {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

}
