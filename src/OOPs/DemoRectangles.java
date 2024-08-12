package OOPs;

class Rectangles{
    double length;
    double width;
    Rectangles(){

    }
    Rectangles(double l){
        this.length=l;
    }
    Rectangles(float w){
        this.width=w;
    }
    Rectangles(float l,float w){
        this(l);
        this.width=w;
    }
    void show(){
        System.out.println("Length = "+(float)length);
        System.out.println("Width = "+(float)width);
        System.out.println("Area = "+(float)(length*width));
    }
}
public class DemoRectangles {
    public static void main(String[] args) {
        Rectangles ob = new Rectangles(4.2f,2.3f);
        ob.show();
    }
}
