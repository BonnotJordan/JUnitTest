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
        return false;
    }

    @Override
    public double area() {
        return width*height;
    }
}
