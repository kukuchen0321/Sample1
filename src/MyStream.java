import java.util.*;

public class MyStream{
    @FunctionalInterface
    interface mystream {
        int MyMap(int n);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] a = {2,3,4};
        MyStream.MyMap(a,x->x*3);
        for (int i = 0; i < a.length;i++) {
            System.out.println(a[i]);
        }

    }

    private static void MyMap(int[] a, mystream s) {
        for(int i = 0 ; i <a.length;i++) {
            a[i] = s.MyMap(a[i]);
        }
    }
}