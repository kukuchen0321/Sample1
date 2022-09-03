import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class javaeight {
    public static void main(String[] args) {
        String s1 = "walabcwalexywalxzsfwalmx";
        String ns1 = Arrays.asList(s1.split("(?i)wal")).stream().collect(Collectors.joining("Sams"));
        System.out.println(ns1);

        String s2 = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        List<String> s2list = Arrays.asList(s2.split(" "));
        Map<String,Integer> map = s2list.stream().collect(Collectors.groupingBy(o->o.toLowerCase(),Collectors.summingInt(o->1)));
        System.out.println(map);
    }
}
