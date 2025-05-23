package ArraysProblem.Easy;
import java.util.*;
public class GetSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
