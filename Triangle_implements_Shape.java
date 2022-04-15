package Abtract;

public class Triangle_implements_Shape {
    private int base, height;
    public Triangle_implements_Shape(int base,int height){
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return "Triangle[base=" + base + ",hieght=" + height +"]";
    }
}
