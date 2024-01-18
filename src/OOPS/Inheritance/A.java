package OOPS.Inheritance;

public class A {
    public int id;
    protected String name;
    private int age = 20;
    int batch_id;

     A(){
        System.out.println("A constructor is called");
        this.id = 0;
        this.name = "defalut";
        this.age = 0;
        this.batch_id = 0;
    }

}
