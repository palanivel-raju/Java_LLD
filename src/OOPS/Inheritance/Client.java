package OOPS.Inheritance;

public class Client {
    public static void main(String[] args) {
//        D d = new D();
//        d.id = 1;
//        d.name = "Arjun";
////        d.age = 25; //private member can't be accessible in other child class;
//        d.batch_id = 21;

        D x = new D("i'm from main D da");
        System.out.println("from main method");
    }
}
