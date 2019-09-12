public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + getRadius() + ", height: " + getHeight() + ", color: " + getColor() + ", volume: " + getVolume();
    }
}
