package OOPS.Interfece;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(20000, 150),
                new Car(25000, 180),
                new Car(18000, 130)
        };

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println("Price: " + car.Price + ", Speed: " + car.Speed);
        }

    }
}
