import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

public final class main {

    public final int INDEX = 1;

    public static void main(String[] args){
        String str = "Algorithms";
        String sub1 = str.substring(2,4);
        String sub2 = str.substring(0,4);
        System.out.println(sub1);
        System.out.println(sub2);

        String a = "abc";
        String b = "abc";
        boolean ab = true;
        for (int i = 0 ; i < a.length();i++) {
            if (a.charAt(i) != b.charAt(i)) {
                ab = false;
                break;
            }
        }
        System.out.println(ab);

        List<String> token = new ArrayList<>();
        String url = "https://www.amazon.com/demo?test=abc";
        StringTokenizer st = new StringTokenizer(url,":// . / ? =");
        while (st.hasMoreTokens()) {
            token.add(st.nextToken());
        }
        System.out.println(token.toString());

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < token.size();i++) {
            sb.append(token.get(i));
        }
        System.out.println(sb.toString());
    }

    public final int sum(int a, int b ) {
        //INDEX = a+b; CAN'T MODIFY DUE TO FINAL VARIABLE.
        int s = a+b;
        return s;
    }
}
