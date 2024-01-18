package OOPS.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
public class Subtract implements Callable<Void>{
    Value v;
    private Lock lock;
    public Subtract(Value x, Lock lock){
        this.v = x;
        this.lock = lock;
    }
    
    @Override
    public Void call() throws Exception{
        for(int i=1; i<=5000; i++){
            lock.lock();
            if(i == 1000){
                System.out.println("i'm 1000");
            }
            System.out.println("Lock acquired from the Subtractor: " + i);
            this.v.value -= i;
            lock.unlock();
        }
        return null;
    }
}
