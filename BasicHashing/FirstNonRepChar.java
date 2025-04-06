package BasicHashing;
import java.util.*;

public class FirstNonRepChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            map.put( ch , map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("the First Non repatative character is :" + entry.getKey());
                return;
            }
        }
    }
}
