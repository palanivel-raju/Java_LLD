package OOPS.Abstract;

public abstract class Animal {
    String name;
    int age;
    static String colour = "GREEN";

    void print () {
        System.out.println(" walking in the forest");
    }
    public abstract void makeasound();
    Animal(String name){
        this.name = name;
        this.age = 10;
    }
}
