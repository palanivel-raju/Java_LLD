package OOPS.CopyConstructors;

public class Client {
    public static void main(String[] args) {
        // Create a Point
        Point pointA = new Point(2, 3);
        Point pointB = new Point(pointA);

        // Create a Rectangle using different constructors
        Rectangle rectangle1 = new Rectangle(1, 1, 4, 4);
        Rectangle rectangle2 = new Rectangle(pointA, pointB);
        Rectangle rectangle3 = new Rectangle(rectangle1);

        // Output the rectangles
        System.out.println("Rectangle 1: Top Left (" + rectangle1.topLeft.x + ", " + rectangle1.topLeft.y + "), Bottom Right (" + rectangle1.bottomRight.x + ", " + rectangle1.bottomRight.y + ")");
        System.out.println("Rectangle 2: Top Left (" + rectangle2.topLeft.x + ", " + rectangle2.topLeft.y + "), Bottom Right (" + rectangle2.bottomRight.x + ", " + rectangle2.bottomRight.y + ")");
        System.out.println("Rectangle 3: Top Left (" + rectangle3.topLeft.x + ", " + rectangle3.topLeft.y + "), Bottom Right (" + rectangle3.bottomRight.x + ", " + rectangle3.bottomRight.y + ")");
    }
}
