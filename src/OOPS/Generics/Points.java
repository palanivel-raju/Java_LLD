package OOPS.Generics;
import java.util.*;
public class Points{
    private int x;
    private int y;
    public Points(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // complete the code here
        Points p = (Points) obj;
        if(this.x == p.x && this.y == p.y){
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        // complete the code here
        System.out.println(Objects.hash(x,y));
        return Objects.hash(x,y);
    }

    public static void main(String[] args) {
        Points p1 = new Points(5,10);
        p1.equals(new Points(5,10));
        p1.equals(new Points(5,100));
        System.out.println(p1.hashCode());
    }
}
