public class Circle implements Shape {
    private Point center;
    private int radius;


    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean contains(Point p) {
        return Math.pow(p.getX()-center.getX(),2)+Math.pow(p.getY()-center.getY(),2) < Math.pow(radius,2);
    }

    @Override
    public double area() {
        return (Math.PI*(Math.pow(radius,2)));
    }
}