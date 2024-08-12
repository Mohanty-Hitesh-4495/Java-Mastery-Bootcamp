package ExceptionHandling;
import java.io.IOException;

class DemoThrow {
    public void x1()throws IOException{
        throw new IOException("Error");
    }
}
public class Demo{
    public static void main(String[] args) throws IOException {
//        try{
            DemoThrow ob = new DemoThrow();
            ob.x1();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
