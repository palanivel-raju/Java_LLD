package OOPS.AccessModifier;
import OOPS.Inheritance.D;

public class Student extends D {
    Student(){
        System.out.println("Student class constructor from access modifer");
    }
    void accessible(){
        id = 2;
        name = "palanivel";
        //age , batch_id -> private can't even accessible even the same package other classes
        // and default can't be accessible over the other package

    }

}
