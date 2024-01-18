package OOPS.Constructors;

public class Student {
    int id;
    String name;
    int age;
    Exam exam;
    public Student(){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
//        this.exam = new exam;
    }
    public Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.age = other.age;
        this.exam = other.exam;
    }
}
