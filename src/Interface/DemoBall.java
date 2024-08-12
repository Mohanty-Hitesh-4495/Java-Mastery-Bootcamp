package Interface;

interface Shape1{
    public void colour();
    public void size();
}
class Ball implements Shape1{
    @Override
    public void colour(){
        System.out.println("GREEN");
    }
    @Override
    public void size(){
        System.out.println("LARGE");
    }
}
public class DemoBall {
    public static void main(String[] args) {
        Ball ob = new Ball();
        ob.colour();
        ob.size();
    }
}
