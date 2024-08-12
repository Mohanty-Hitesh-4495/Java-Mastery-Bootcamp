//  one constant int variable, one float instance variable and one static string variable;
// write an example program to print all this values of any object of this class;

class A{
    final int a=10;
    float b;
    static String name="Bikash";
    A(float num2,String name){
        this.b=num2;
        A.name=name;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }
}
public class Test22 {
    public static void main(String[] args) {
        A ob = new A(2.31f,"hitesh");
        ob.show();
        A ob2 = new A(1.2f,"Mina");
        ob.show();
        ob2.show();
    }
}
