import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    public static final double DELTA = 1e-6;
    @Test
    public void contains() {
        Point p = new Point(2,2);
        Circle circle = new Circle(p,1);
        assertEquals(false,circle.contains(new Point(1,3)));
    }

    @Test
    public void area() {
        Point p = new Point(1,1);
        Circle circle = new Circle(p, 5);
        double area = circle.area();
        assertEquals(Math.PI*25, area, DELTA);
    }
}