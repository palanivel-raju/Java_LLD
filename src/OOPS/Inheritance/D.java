package OOPS.Inheritance;

public class D extends C{
    protected D(){
        System.out.println("D constructor is called");
    }
    protected D(String name){
        super("C params call");
        System.out.println(name);
    }
}
