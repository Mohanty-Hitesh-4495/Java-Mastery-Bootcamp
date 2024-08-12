class A6{
    public void x1(String s1){
        System.out.println(1);
    }
    public void x1(StringBuffer sb){
        System.out.println(2);
    }
}
public class AA6 {
    public static void main(String[] args) {
        A6 ob=new A6();
        ob.x1("hitesh");
    }
}
