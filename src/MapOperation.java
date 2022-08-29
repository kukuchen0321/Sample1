import java.util.*;

public class MapOperation {
    public static Map<Character,Integer> duplicate(String s) {
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> result = new HashMap<>();
        for (int i = 0 ; i < len; i++) {
            char cur = s.charAt(i);
            if (!map.containsKey(cur)) {
                map.put(cur,1);
            }
            else if (map.containsKey(cur)) {
                int val = map.get(cur);
                val++;
                map.put(cur,val);
                result.put(cur,val);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "papa johns";
        System.out.println(duplicate(s));
    }
}
