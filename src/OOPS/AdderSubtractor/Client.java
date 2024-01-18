package OOPS.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder a = new Adder(v);
        Subtract s = new Subtract(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> fututreA = es.submit(a);
        Future<Void> fututreS = es.submit(s);

        fututreA.get();
        fututreS.get();

        System.out.println(v.value);
    }
}
