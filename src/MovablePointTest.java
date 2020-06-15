public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        MovablePoint movablePoint2 = new MovablePoint(4,3);
        movablePoint2.setX(1);
        movablePoint2.setY(2);
        System.out.println(movablePoint2);

        MovablePoint movablePoint3 = new MovablePoint(3,2,1,2);
        System.out.println(movablePoint3);
    }
}
