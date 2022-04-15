package Abtract;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint_implements_Movable p1 = new MovablePoint_implements_Movable(1,2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        MovablePoint_implements_Movable p2 = new MovablePoint_implements_Movable(3,4);
        p2.moveUp();
        System.out.println(p2);
        MovablePoint_implements_Movable p3 = (MovablePoint_implements_Movable) p2;
        System.out.println(p3);

    }
}
