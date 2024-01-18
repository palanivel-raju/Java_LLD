package OOPS.MCQ2;

public class A {
    int d1 = 10;
    int d = 20;

    synchronized void fun1(){
        System.out.println("fun1 of A");
    }
    synchronized void fun(){
        System.out.println("fun of A");
    }
    static void sfun(){
        System.out.println("sfun of A");
    }
}
