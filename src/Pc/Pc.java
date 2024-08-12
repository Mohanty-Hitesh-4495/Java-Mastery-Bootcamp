package Pc;

public class Pc {
    public static void main(String[] args) {
        Parent P=new Parent();
        Child C=new Child();
        P.set(1);
        C.set(2,4);
        C.info();
        //System.out.println("Pc.Child Object: Field a = "+C.a);
        P.info();
    }
}
