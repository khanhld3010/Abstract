package shape.rectangle;

import shape.circle.CircleResizeable;

public class RectangleTest {
    static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);
        System.out.println("-------------------------------");
        rectangle = new RectangleResizeable(3, 6);
        System.out.println(rectangle);
        System.out.println("Width of Rectangle Now: " + rectangle.getWidth());
        System.out.println("Length of Rectangle Now: " + rectangle.getLength());
        System.out.println("Area of Rectangle Now: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle Now: " + rectangle.getPerimeter());
        System.out.println("----------Resize-----------");
        RectangleResizeable rectangleResizeable = (RectangleResizeable) rectangle;
        rectangleResizeable.resize(50);
        System.out.println("Width of Rectangle After: " + rectangle.getWidth());
        System.out.println("Length of Rectangle After: " + rectangle.getLength());
        System.out.println("Area of Rectangle After: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle After: " + rectangle.getPerimeter());
    }
}
