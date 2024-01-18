package OOPS.Polymorphism;

public class Client {
    public static void complietim(Animal x){
        x.walk();
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.walk();
//        private member access

        Animal x = new Dog();
        x.walk();
//        x.bark();


        System.out.println("");
    }
}
