import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    public static final double DELTA = 1e-6;

    @Test
    public void contains() {
        Point topLeftCorner = new Point(1,2);
        Rectangle rectangle = new Rectangle(topLeftCorner,8,4);
        assertEquals(true,rectangle.contains(new Point(5,1)));
    }

    @Test
    public void area() {
        Point p = new Point(1,1);
        Rectangle rectangle = new Rectangle(p,5,3);
        double area = rectangle.area();
        assertEquals(15,area,DELTA);
    }
}