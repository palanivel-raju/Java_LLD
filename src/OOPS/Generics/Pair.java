package OOPS.Generics;
import java.lang.*;

public class Pair <v,k>{
    v name;
    k age;
    public void setName(v name){
        this.name = name;
    }
    public v getName(){
        return this.name;
    }
    public void setAge(k age){
        this.age = age;
    }
    public k getAge(){
        return this.age;
    }
    //constructor has not to pass because in raw type you have to  mention each level for default constructor
//    public Pair(v name, k age){
//        this.name = name;
//        this.age = age;
//    }

    public v printName(v name){
        System.out.println(name);
        return name;
    }
    // we have to declare static in this way only
    public static <T> void printId(T Id){
        System.out.println("id in static method : " + Id);
    }

    //this way of using wrapper class of double or any datatype we can do operation as such we want
    public <T extends Number> Double addNumber(T num1, T num2){

        return num1.doubleValue() + num2.doubleValue();
    }
}
