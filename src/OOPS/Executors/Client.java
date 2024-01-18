package OOPS.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Value v = new Value();
        Adder a = new Adder(v, lock);
        Subtract s = new Subtract(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> fututreA = es.submit(a);
        Future<Void> fututreS = es.submit(s);

        fututreA.get();
        fututreS.get();

        System.out.println(v.value);
    }
}
