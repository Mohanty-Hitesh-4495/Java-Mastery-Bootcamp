package OOPs;

interface Shape2D{
    float perimeter ();
    float area();
}
interface Shape3D{
    float surface();
    float volume();
}
class Rectangle implements Shape2D{
    float length,width;
    void setRectangle(float len, float wid){
        this.length=len;
        this.width=wid;
    }
    @Override
    public float perimeter() {
        return 2*(this.width+this.length);
    }
    @Override
    public float area() {
        return this.length*this.width;
    }
}
class Circle{
    
}
public class DemoShape {
}
