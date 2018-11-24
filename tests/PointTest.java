import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void testDistance() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,4);
        double dist = 73.00;
        assertEquals(p1.distance(p2),is(dist));

    }

    @Test
    public void testMove() {
        Point p = new Point(3,5);
        int dx = 1;
        int dy = 8;
        assertEquals(p.move(dx,dy),is(new Point(4,13)));
    }

    @Test
    public void testEquals() {
        Point p1 = new Point(2,5);
        Point p2 = new Point(2,7);
        assertFalse(p1==p2);
    }

    @Test
    public void testHashCode() {
    }

}