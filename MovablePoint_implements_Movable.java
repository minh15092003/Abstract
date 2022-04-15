package Abtract;

public class MovablePoint_implements_Movable {
    private int x,y;
    public MovablePoint_implements_Movable(int x , int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "( + x +","+ y +")";
    }
    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
}
