/*
    define a class rectangle with 2 private instance
    variable length and width and 2 default methods
    only get and set for each instance variable...and find the area.
*/

import java.util.*;
class Rect {
  private float length;
  private float width;
  float getLength(){
      return length;
  }
  float getWidth(){
      return width;
  }
  void set(float l,float w){
        this.length=l;
        this.width=w;
  }
  float AreaRect(){
      return length*width;
  }
  void display(){
      System.out.println("ENTERED LENGTH ="+length);
      System.out.println("ENTERED WIDTH ="+width);
  }
}
class DemoRect{
    public static void main(String[] args) {
        float l,w;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF RECTENGLE =");
        l=sc.nextFloat();
        System.out.print("ENTER THE WIDTH OF RECTENGLE =");
        w=sc.nextFloat();
        Rect lw=new Rect();
        lw.set(l,w);
        lw.display();
        //float area=lw.AreaRect();
        System.out.println("AREA OF RECTANGLE="+(lw.getLength()*lw.getWidth()));
        sc.close();
    }
}
