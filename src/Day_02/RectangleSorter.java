package Day_02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//  write a program to sort the rectangles in ascending order according to their area.
//  if two rectangles are having same area then consider the rectangle as small if the length is less than other.
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "OOPs.Rectangle [Length=" + length + ", Width=" + width + ", Area=" + getArea() + "]";
    }
}

public class RectangleSorter {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4.5, 5));
        rectangles.add(new Rectangle(6, 1));
        rectangles.add(new Rectangle(3, 2));

        // Sort rectangles based on their areas
        Collections.sort(rectangles, new Comparator<Rectangle>()
        {
            @Override
            public int compare(Rectangle r1, Rectangle r2) {
                if(r1.getArea()==r2.getArea()){
                    return (int)(r1.getLength()-r2.getLength());
                }
                return (int) (r1.getArea() - r2.getArea());
            }
        });

        // Display the sorted rectangles
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}