package OOPS.Nodeconst;

public class Node {
    private int data;
    private Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node(Node node){
        this.data = node.data;
        if(node != null){
            this.next = new Node(node.next);
        }
        else
        {
            this.next = null;
        }
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNode(){
        return next;
    }
}
