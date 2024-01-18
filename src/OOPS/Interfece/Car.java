package OOPS.Interfece;

public class Car implements Comparable<Car>{
    int Price;
    int Speed;
    public Car(int Price,int Speed){
        this.Price = Price;
        this.Speed = Speed;
    }

    @Override
    public int compareTo(Car othercar){
        return this.Price - othercar.Price;
    }

}