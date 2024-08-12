package Interface;

interface MyInterface {
    public void first();
    public int second(int a,int b);
    default public void third(){
        System.out.println("Hello Hitesh...");
    }
    static void fourth(){
        System.out.println("Hello Jadu...");
    }
    int a=5;//implicitly public static final...
    //acts like a constant...
}
class SubFirst implements MyInterface{
    public void first(){
        System.out.println("Hello Prakash...1");
    }
    public int second(int a,int b){
        return a+b;
    }
}
class SubSecond implements MyInterface{
    public void first(){
        System.out.println("Hello Prakash...2");
    }
    public int second(int a,int b){
        return a+b;
    }
    public void third(){
        System.out.println("Hello Hitesh...2");
    }
}
class DemoInterface{
    public static void main(String[] args) {
        SubFirst A=new SubFirst();
        A.first();
        System.out.println(A.second(4,3));
        A.third();
        MyInterface.fourth();
        System.out.println("A="+A.a);
        SubSecond B=new SubSecond();
        B.first();
        System.out.println(B.second(7,3));
        B.third();
        MyInterface.fourth();
        System.out.println("A="+B.a);
    }
}