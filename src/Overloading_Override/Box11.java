package Overloading_Override;
// demonstrate Method Override and Dynamic Dispatch...

class Box1 extends Rectangle1{
    float height;
    Box1(float l,float w, float h){
        super(l,w);
        this.height=h;
    }
    @Override
    void display(){
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Height : "+height);
    }
}
public class Box11 {
    public static void main(String[] args) {
        Rectangle1 Rect = new Rectangle1(15.26F,6.25F);
        Box1 Box = new Box1(26.2f,5.45f,8.59f);
        Rectangle1 rect = new Box1(15.46f,56.1f,3.15f);
        Rect.display();
        Box.display();
        rect.display();


    }
}
