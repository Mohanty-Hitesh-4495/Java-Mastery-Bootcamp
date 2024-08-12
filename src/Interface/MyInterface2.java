package Interface;

//Define an interface "Interface1" with one abstract method "Interface2" with one abstract and default method.
//define a class which define both interface...
//define a demo-class which will use object of both subclass...
interface MyInterface1{
    public void name(String name);
}
interface MyInterface2{
    public void roll(int a);// abstract method roll

}
// multiple inheritance using interface
class StudentD implements MyInterface1,MyInterface2{
    public void name(String name){
        System.out.println(name);
    }
    public void roll(int a){
        System.out.println("Roll no = "+a);
    }
}
class DemoStudentD{
    public static void main(String[] args) {
        StudentD a=new StudentD();
        a.name("NAME = HITESH MOHANTY");
        a.roll(36);
    }
}