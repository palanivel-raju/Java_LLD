package OOPS.ProducerandConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore prodsema = new Semaphore(5);
        Semaphore conssema = new Semaphore(0);
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1; i<=8; i++){
            es.execute(new Producer(store, prodsema, conssema));
        }
        for(int i=1; i<=20; i++){
            es.execute(new Consumer(store,prodsema, conssema));
        }
    }
}
