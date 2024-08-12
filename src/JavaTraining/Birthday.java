class wish{
    void greet(){
        System.out.println("Happy Birthday!!!");
    }
}
class Mywish extends wish{
    void greet(){
        System.out.println("Happy Birthday Pilaa!!!");
    }
}
public class Birthday {
    public static void main(String[] args) {
        wish J=new Mywish();
        J.greet();
    }
}
