package OOPs;// write a program to demonstrate three use of this keyword.

class This {
    int num, num1;

    This() {

    }

    This(int num) {
        this.num = num;
    }

    This(int num, int num1) {
        this(num);
        this.num1 = num1;
    }

    static void show(This A) {
        System.out.println("num = " + A.num);
        System.out.println("num1 = " + A.num1);
    }

    void Compare(This A) {
        if ((A.num + A.num1) > (this.num + this.num1))
            This.show(A);
        else
            This.show(this);
    }

}
public class DemoThis {
    public static void main(String[] args) {
        This p= new This(2,3);
        System.out.println("P OBJECT");
        This.show(p);
        This q=new This(1,5);
        System.out.println("Q OBJECT");
        This.show(q);
        System.out.println("AFTER COMPARE");
        p.Compare(q);
    }
}
