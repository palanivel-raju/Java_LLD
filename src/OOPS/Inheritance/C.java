package OOPS.Inheritance;

public class C extends  B{
    C(){
        System.out.println("C constructor is called");
    }
    C(String name){
        this();
        System.out.println(name + " c parameter constructor");
    }
}
