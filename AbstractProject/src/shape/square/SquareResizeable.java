package shape.square;

import shape.resizeable.Resizeable;

public class SquareResizeable extends Square implements Resizeable {
    public SquareResizeable() {
    }

    public SquareResizeable(double side) {
        super(side);
    }

    public SquareResizeable(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {
        double newSide = getSide() + getSide()*percent/100;
        setSide(newSide);
    }
}
