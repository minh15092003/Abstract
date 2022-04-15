package Abtract;

public class Shape {
    private String color;
    public Shape (String color){
        this.color = color;
    }
    public String toStoString(){
        return "Shape[color=" + color + "]";
    }
}
