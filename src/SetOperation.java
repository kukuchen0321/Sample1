import java.util.*;

public class SetOperation {
    public static List<String> contain(List<String> a, List<String> b) {
        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (int i = 0 ; i < a.size();i++) {
            set.add(a.get(i));
        }
        for (int i = 0 ; i < b.size();i++) {
            if(set.contains(b.get(i))) {
                result.add(b.get(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>();
        name1.add("jack");
        name1.add("john");
        name1.add("chris");
        name1.add("paul");
        List<String> name2 = new ArrayList<>();
        name2.add("jack");
        name2.add("john");
        name1.add("daniel");

        System.out.println(contain(name1,name2));
    }

}
