package OOPS.Abstract;

import OOPS.MCQ2.A;

public class Client {
    public static void main(String[] args) {
        // animal is abstract class cant be intantiated
//    Animal a = new Animal();
//        Animal x = new Dog();
//        x.makeasound();
//        x.print();
//        x.name  ="hynaa";
//        x.age = 12;
//        Animal.colour = "Black";
//        System.out.println("");
//        Dog d = new Bulldog();
//        d.dogbreed();
//        System.out.println(d.var);
//        Bulldog bd = new Bulldog();
//        System.out.println(bd.var);
//        bd.dogbreed();
//            Dog d = new Dog();
//            Dog d1 = new Dog();
//            Dog d2 = new Dog();
//            Dog d3 = new Dog();
//            Dog d4= new Dog();
//            System.out.println(d.var);
//            System.out.println(d1.var);
//            System.out.println(d2.var);
//            System.out.println(d3.var);
//            System.out.println(d4.var);

        Animal A = new Cat("googlekuttan");
        A.makeasound();
        System.out.println("------------");

    }
}
