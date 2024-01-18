package OOPS.CopyConstructors;

public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(Point Other){
        this.x = Other.x;
        this.y = Other.y;
    }
}
