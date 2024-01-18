package OOPS.MCQ3;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "ABC";
        p1.age = 10;

        Person p2 = new Person();
        p2.name = "DEF";
        p2.age = 20;
        fun(p1, p2);
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

    }
    static void fun(Person p1dash, Person p2dash){
        Person temp = p1dash;
        p1dash = p2dash;
        p2dash = temp;
        p1dash.age = 30;
        p1dash.name = "Alaya";
    }
}
