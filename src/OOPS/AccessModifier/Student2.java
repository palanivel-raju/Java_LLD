package OOPS.AccessModifier;

import OOPS.Inheritance.User;

public class Student2 extends User {
    void accesible(){
        id = 3;
        name = "palanivel";//protected can be accesible
//        age = private not accesible not even outside of class
//        batch_id // as it default can't be used outside the package
    }
    User u = new User();
//    u.name ="vel";
}
