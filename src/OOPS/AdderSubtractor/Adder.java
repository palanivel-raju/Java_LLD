package OOPS.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void>{
    private Value v;
//    private Lock lock;
    public Adder(Value x){
        this.v = x;
//        this.lock = lock;
    }

    @Override
    public Void call() throws Exception{
        for(int i=1; i<=5000; i++){
//            synchronized (v){
//                System.out.println("Lock acquired from the adder: " + i);
//                this.v.value += i;
//            }
//            this.v.incrementBy(i);
        }
        return null;
    }
}
