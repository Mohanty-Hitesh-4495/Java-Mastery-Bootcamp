package ParentChild;

public class DemoPC {
    public static void main(String[] args) {
        ParentClass P=new ParentClass();
        ChildClass C=new ChildClass();
//        System.out.println("Pc.Parent Object: Field= "+P.a);
//        System.out.println("Pc.Child Object: Field= "+C.a);
        C.infoParent();
        System.out.println("Pc.Child Object: Field b= "+C.b);
        P.info();
        C.info();
    }
}
