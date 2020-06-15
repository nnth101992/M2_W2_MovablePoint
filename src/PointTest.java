public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        System.out.println(point1);

        Point point2 = new Point();
        point2.setX(3);
        point2.setY(4);
        System.out.println(point2);

        Point point3 = new Point();
        point3.setXY(2,3);
        System.out.println(point3);
    }
}
