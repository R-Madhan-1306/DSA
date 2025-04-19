
import java.util.*;
class PascalTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<List<Integer>> res = PascalTriangleRes(n);
        for(List<Integer> nums : res)
        {
            for(int i= n-2;i>=0;i--)
            {
                System.out.print(" ");
            }
            for(int num : nums)
            {
                System.out.print(num+" ");
            }
            System.out.println();
            n--;
        }
    }

    public static List<List<Integer>> PascalTriangleRes(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            List<Integer> tempList = new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                tempList.add(nCr(i-1,j-1));
            }
            ans.add(tempList);
        }
    return ans;
    }

    public static int nCr(int n,int r)
    {
        int res = 1;

        for(int i=0;i<r;i++)
        {
            res = res*(n-i);
            res = res/(i+1);
        }
    return (int) res;
    }
}