import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.*;

public class PointTest {
    public static final double DELTA = 1e-6;
    @Test
    public void testDistance() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,4);
        double dist = Math.sqrt(5.0);
        assertEquals(dist,p1.distance(p2),DELTA);

    }

    @Test
    public void testMove() {
        Point p = new Point(3,5);
        int dx = 1;
        int dy = 8;
        assertEquals(new Point(4,13),p.move(dx,dy));
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