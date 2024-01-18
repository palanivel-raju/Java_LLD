package OOPS.Constructors;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(2, "palanivel", 25);
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);
        Student s2 = new Student(s1);
        s2.exam.exam_id = 5;

//        Student s2 = new Student(s1);
        System.out.println("In client");
    }
}
