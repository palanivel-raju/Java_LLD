package OOPS.ProducerandConsumer;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxitem;
    private ConcurrentLinkedDeque<Object> list;

    public Store(int maxitem){
        this.maxitem = maxitem;
        this.list = new ConcurrentLinkedDeque<>();
    }

    public int getMaxsize(){
        return this.maxitem;
    }
    public ConcurrentLinkedDeque<Object> getList(){
        return this.list;
    }

    public void addItem(){
        System.out.println("Producer consuming time, current size : " + this.list.size());
        this.list.add(new Object());
    }

    public void removeItem(){
        System.out.println("Customer consuming time, current size : " + this.list.size());
        this.list.remove();
    }
}
