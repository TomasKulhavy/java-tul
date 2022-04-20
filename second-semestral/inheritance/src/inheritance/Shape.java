package inheritance;

public abstract class Shape {
    protected String name = "Geom shape"; // přístupné potomkům

    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    public abstract double area();

    public double circum() {
        return 0;
    }

    @Override
    public String toString() {
        return name + ": " + getShapeName();
    }
}
