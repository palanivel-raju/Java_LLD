package OOPS.ProducerandConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodsema;
    Semaphore conssema;
    public Producer(Store store, Semaphore prodsema, Semaphore conssema){
        this.store = store;
        this.prodsema = prodsema;
        this.conssema = conssema;
    }

    @Override
    public void run() {
        while(true){
            try {
                prodsema.acquire();
//                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            conssema.release();
        }
    }
}


