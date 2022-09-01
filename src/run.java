import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class run {
    static class classA {
        public String getMethod(){
            return "A.getMethod";
        }

    }

    static class classB {
        public String getMethod(){
            return "B.getMethod";
        }
    }

    public static void runSameTime(){
        ExecutorService es = Executors.newFixedThreadPool(2);

        try {
            Future<String> aFuture = es.submit(()-> new classA().getMethod());
            Future<String> bFuture = es.submit(()-> new classB().getMethod());
            boolean done = false;
            while(!done) {
                if(aFuture.isDone() && bFuture.isDone()) {
                    System.out.println(bFuture.get() + " " + aFuture.get());
                    done = true;
                }
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        catch (Exception e) {
         e.printStackTrace();
        }
        finally {
            es.shutdown();
        }
    }
    public static void main(String[] args) {
        runSameTime();
    }
}
