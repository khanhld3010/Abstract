package shape.square;

public class SquareTest {
    static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println("-------------------------------");
        square = new SquareResizeable(4);
        System.out.println(square);
        System.out.println("Side of Square Now: " + square.getSide());
        System.out.println("Area of Square Now: " + square.getArea());
        System.out.println("Perimeter of Square Now: " + square.getPerimeter());
        System.out.println("----------Resize-----------");
        SquareResizeable squareResizeable = (SquareResizeable) square;
        squareResizeable.resize(50);
        System.out.println("Side of Square After: " + square.getSide());
        System.out.println("Area of Square After: " + square.getArea());
        System.out.println("Perimeter of Square After: " + square.getPerimeter());
    }
}
