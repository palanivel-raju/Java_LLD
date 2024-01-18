package OOPS.Abstract;

public class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    public void makeasound(){
        System.out.println("meow meow --" + this.name);
        System.out.println("kuttan age is : " +this.age);
        System.out.println("kuttan color: " + colour );
    }
}
