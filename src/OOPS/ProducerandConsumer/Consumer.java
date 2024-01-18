package OOPS.ProducerandConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    public Semaphore prodsema;
    public Semaphore conssema;

    public Consumer(Store store, Semaphore prodsema, Semaphore conssema){
        this.store = store;
        this.prodsema = prodsema;
        this.conssema = conssema;
    }
    @Override
    public void run(){
        while(true){

                try {
                    conssema.acquire();
//                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
                store.removeItem();
                prodsema.release();
        }
    }
}


