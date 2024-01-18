package OOPS.AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtract implements Callable<Void>{
    Value v;
//    private Lock lock;
    public Subtract(Value x){
        this.v = x;
//        this.lock = lock;
    }
    
    @Override
    public Void call() throws Exception{
        for(int i=1; i<=5000; i++){
//          synchronized (v){
//              System.out.println("Lock acquired from the Subtractor: " + i);
//              this.v.value -= i;
//          }
//            this.v.decrementBy(i);
        }
        return null;
    }
}
