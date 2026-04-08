package shape.rectangle;

import shape.resizeable.Resizeable;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    public RectangleResizeable(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void resize(double percent) {
        double newWidth = getWidth() + (getWidth()* percent/100);
        double newLength = getLength() + (getLength()*percent/100);
        setWidth(newWidth);
        setLength(newLength);
    }
}
