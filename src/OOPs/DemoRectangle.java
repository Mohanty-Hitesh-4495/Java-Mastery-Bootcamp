package OOPs;
import java.util.ArrayList;
import java.util.Collections;

// write a java program to sort all the given rectangle in the ascending order.
public class DemoRectangle{
        public static void main(String[] args) {
                ArrayList<Double> area = new ArrayList<>();
                Rect ob1=new Rect(12,6);
                area.add(ob1.setArea());
                System.out.println(ob1.setArea());
                Rect ob2=new Rect(6,1);
                area.add(ob2.setArea());
                System.out.println(ob2.setArea());
                Rect ob3=new Rect(2,3);
                area.add(ob3.setArea());
                System.out.println(ob3.setArea());
                Collections.sort(area);
                System.out.println(area);
        }
        }

class Rect {
        double length,width;
        double area;
        Rect(int l,int w){
                this.length=l;
                this.width=w;
        }
        public double setArea(){
                return this.area=length*width;
        }


}
