class A7{
    public void x1(){
        System.out.println(1);
    }
    public void x1(float sb){
        System.out.println(2);
    }
}
public class AA7 {
    public static void main(String[] args) {
        A7 ob=new A7();
        ob.x1(100L);
    }
}
