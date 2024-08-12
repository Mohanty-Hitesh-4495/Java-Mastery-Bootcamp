package OOPs;

public class DemoFinal {

    //    public static void main(String[] args) {
//        final int number;// once number is assigned with a value it cannot be modified.
//        Scanner sc = new Scanner(System.in);
//        number=sc.nextInt();
//        System.out.println(number);
//        number=56;
//        System.out.println(number);
//
//    }
    final int a = 5;
    final void greet() {
        System.out.println("HELLO WORLD");
    }
//    public static void main(String[] args) {
//        OOPs.DemoFinal ob = new OOPs.DemoFinal();
//        OOPs.DemoFinal ob1 = new OOPs.DemoFinal();
//        ob.greet();
//        System.out.println(ob1.a);
//        System.out.println(ob.a);
//    }
}
class Final extends DemoFinal{
    public static void main(String[] args) {
        DemoFinal objo = new DemoFinal();// final method can inherit in other class. but cannot be overridden.
        objo.greet();
    }
}
