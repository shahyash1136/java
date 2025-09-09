package shape;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        double area = (4 * Math.PI * Math.pow(super.getRadius(), 2));
        return area;
    }

    @Override
    public double getVolume() {
        // TODO Auto-generated method stub
        double volume = (4 / 3) * Math.PI * Math.pow(super.getRadius(), 2);
        return volume;
    }

}