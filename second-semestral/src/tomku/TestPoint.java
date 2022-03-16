package tomku;

public class TestPoint {
    public static void main(String[] args) {
        Point myPoint = new Point(2, 2);
        Point yourPoint = new Point(4.5, 6.7);

        System.out.println(myPoint.toString());
        System.out.println(yourPoint.toString());
        //System.out.println(yourPoint); // automaticky vola toString()

        System.out.println(myPoint.distanceFromOrigin());
        System.out.println(yourPoint.distanceFromOrigin());

        System.out.println(yourPoint.distanceFrom(myPoint));
    }
}
