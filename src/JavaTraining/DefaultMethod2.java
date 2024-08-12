package JavaTraining;
interface A{
    default void sayHello(){
        System.out.println("HEY, HITESH");
    }
}
interface B{
    default void sayHello(){
        System.out.println("HELLO, DEBASISH");
    }
}
class C implements A,B{
    @Override
    public void sayHello(){
        A.super.sayHello();
        B.super.sayHello();
    }
}
class DefaultMethod2 {
    public static void main(String[] args) {
        C ob = new C();
    }
}
