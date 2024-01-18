package OOPS.Generics;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setName("pickachu");
        pair.setAge(26);
        System.out.println(pair.getName());
        System.out.println(pair.getAge());
        Pair<Integer, Integer> pair1 = new Pair<>();
        pair1.setName(20);
        pair1.setAge(45);
        Pair<Double, Double> pair2 = new Pair<>();
        pair2.setName(8.0);
        Pair pair3 = new Pair(); //raw type this is before java5 this is how worked so still it supports
        pair3.setAge(new Object());
        pair3.setName(new Object());
        System.out.println(pair3.getAge());
        // as many many pair u can create with different data type using a single pair class
        pair.printName("Aaru");

        //static method
        Pair.printId(8);

        //passing Parameter
        System.out.println(pair.addNumber(15, 20));
    }
}
