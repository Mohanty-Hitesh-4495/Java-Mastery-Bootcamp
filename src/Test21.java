class Demo1{
    int a=15;
    static int b=20;
    void Show(){
        System.out.println(a);
        System.out.println(b);
    }
    static void show(){
        System.out.println(b);
    }
}
public class Test21 {
    public static void main(String[] args) {
        Demo1 ob = new Demo1();
        ob.Show();
    }
}
