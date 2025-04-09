package ArraysProblem.Easy;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count =0;
        for(int i=0;i<n;i++)
        {
            if(arr[count] != arr[i])
            {
                count++;
                arr[count] = arr[i];
            }

        }
        for(int i=0;i<count+1;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
