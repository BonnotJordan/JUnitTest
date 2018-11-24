public class Rectangle implements Shape {
    private Point topLeftCorner;
    int width,height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(Point p) {
        return ((topLeftCorner.getX() +width) >= p.getX() && (topLeftCorner.getY() - height) <= p.getY()&& p.getX() >= topLeftCorner.getX() && p.getY() <= topLeftCorner.getY());
    }

    @Override
    public double area() {
        return width*height;
    }
}
