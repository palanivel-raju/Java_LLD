package OOPS.Constructors;

public  class StudentTelescope{
    // write the code of student class here
    int age;
    String name;

    StudentTelescope(){
        this(0, null);
    }
    StudentTelescope(int age){
        this(age, null);
    }
    StudentTelescope(String name){
        this(0, name);
    }
    StudentTelescope(int age, String name){
        this.age = age;
        this.name = name;
    }
}
