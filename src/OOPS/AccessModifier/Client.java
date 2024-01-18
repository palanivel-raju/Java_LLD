package OOPS.AccessModifier;

public class Client{
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 2;
        System.out.println(" user class");
        Student2 stu = new Student2();
        stu.id = 3;
//        stu.name = "velu";// protected member can't be used even the outside child class outside package
    }
}
