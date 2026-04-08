package shape.circle;

import shape.resizeable.Resizeable;

public class CircleTest {
    static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
        System.out.println("-------------------------------");
        circle = new CircleResizeable(50);
        System.out.println(circle);
        System.out.println("Radius of Circle Now: " + circle.getRadius());
        System.out.println("Area of Circle Now: " + circle.getArea());
        System.out.println("Perimeter of Circle Now: " + circle.getPerimeter());
        System.out.println("----------Resize-----------");
        CircleResizeable circleResizeable = (CircleResizeable) circle;
        circleResizeable.resize(50);
        System.out.println("Radius of Circle After: " + circle.getRadius());
        System.out.println("Area of Circle After: " + circle.getArea());
        System.out.println("Perimeter of Circle After: " + circle.getPerimeter());
    }
}
