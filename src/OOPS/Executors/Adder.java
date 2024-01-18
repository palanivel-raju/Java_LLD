package OOPS.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void>{
    private Value v;
    private Lock lock;
    public Adder(Value x, Lock lock){
        this.v = x;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception{
        for(int i=1; i<=5000; i++){
            lock.lock();
            System.out.println("Lock acquired from the adder: " + i);
            this.v.value += i;
            lock.unlock();
        }
        return null;
    }
}
