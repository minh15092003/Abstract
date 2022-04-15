package Abtract;

public class Rectangle_implements_Shape {
    private int langth, with;
    public Rectangle_implements_Shape(int length,int with){
        this.with = with;
    }
    public String toString(){
        return "Rectangle[length="+ langth + ",with=" + with + "]";
    }
}
