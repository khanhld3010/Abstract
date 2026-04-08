package shape;

import shape.circle.Circle;
import shape.colorable.Colorable;
import shape.rectangle.Rectangle;
import shape.square.Square;

public class ShapeTest {
    static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4);
        shapes[2] = new Square(10);
        shapes[3] = new Rectangle(3,6);
        shapes[4] = new Square(20);

        System.out.println("--- KIỂM TRA MẢNG HÌNH HỌC ---");
        for (Shape shape1 : shapes) {
            System.out.println("Hình Này là " +shape1);
            if (shape1 instanceof Colorable){
                Colorable colorable = (Colorable) shape1;
                colorable.howtoColor();
            }
        }


    }
}
