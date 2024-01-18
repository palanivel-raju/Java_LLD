package OOPS.CopyConstructors;

public class Rectangle {
    Point topLeft;
    Point bottomRight;

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
//         this.topLeft.x = topLeftX;
//         this.topLeft.y = topLeftY;
//         this.bottomRight.x = bottomRightX;
//         this.bottomRight.y = bottomRightY;
        this.topLeft = new Point(topLeftX,topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    public Rectangle(Rectangle other){
        this.topLeft = new Point(other.topLeft);
        this.bottomRight = new Point(other.bottomRight);
    }
}
