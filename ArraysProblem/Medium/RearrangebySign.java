package ArraysProblem.Medium;

import java.util.*;

public class RearrangebySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        arr =Rearrange(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] Rearrange(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }

        int[] result = new int[n];
        int posIndex = 0, negIndex = 0;
        boolean isPos = true;
        boolean isNeg = true;
        
        int i=0;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (posIndex < pos.size()) {
                    result[i] = pos.get(posIndex++);
                    if (posIndex == pos.size())
                        isPos = false;
                }
            } else {
                if (negIndex < neg.size()) {
                    result[i] = neg.get(negIndex++);
                    if (negIndex == neg.size())
                        isNeg = false;
                }
            }
            if (!isPos || !isNeg)
                break;
        }
        

        if (!isPos) {
            for (int j = i + 1, k = negIndex; j < n && k < neg.size(); j++, k++) {
                result[j] = neg.get(k);
            }
        }
        
        if (!isNeg) {
            for (int j = i + 1, k = posIndex; j < n && k < pos.size(); j++, k++) {
                result[j] = pos.get(k);
            }
        }
        
        return result;
    }
}
