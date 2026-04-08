package shape.circle;

import shape.resizeable.Resizeable;

public class CircleResizeable extends Circle implements Resizeable {
    public CircleResizeable() {
    }

    public CircleResizeable(double radius) {
        super(radius);
    }

    public CircleResizeable(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        double amountResize = getRadius() * percent / 100;
        double newRadius = getRadius() +amountResize;
        setRadius(newRadius);
    }
}
