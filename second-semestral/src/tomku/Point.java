package tomku;

public class Point {
    private double x;
    private double y;

    // constructor
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    // pretizeny constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // pretizeni metody se stejne jmenuji a jiny pocet vstupnich parametru
    // prekryti metody jsem metodu zdedil a ja napisu kod se stejnou sigranturou (hlavickou), ale dam ji novy kod OVERRIDE
    @Override
    public String toString() {
        return String.format("[%.2f, %.2f]", x, y);
    }

    public double distanceFromOrigin() {
        return distanceFrom(0, 0);
    }

    public double distanceFrom(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distanceFrom(Point p) {
        return Math.hypot(this.x - p.x, this.y - p.y); // pytagorova veta
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
