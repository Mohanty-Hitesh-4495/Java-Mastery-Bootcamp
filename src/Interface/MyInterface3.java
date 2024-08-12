package Interface;

//define three different interfaces and implement all the three interface in a class...
interface MyInterface3{
    public void teacher();
}
interface MyInterface4{
 default void student(){
     System.out.println("STUDENT!");
 }
}
interface MyInterface5{
    public static void college(){
        System.out.println("GANDHI INSTITUTE FOR TECHNOLOGY");
    }
}
class Teacher implements MyInterface3,MyInterface4,MyInterface5{
    public void teacher(){
        System.out.println("DR. SATYA RANJAN PATNAIK");
    }
}
class DemoTeacher{
    public static void main(String[] args) {
        Teacher t=new Teacher();
        MyInterface5.college();
        t.teacher();
        t.student();
    }

}