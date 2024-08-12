package Inheritance;

class One{
    int a;
    One(){
        this.a=69;
    }
    One(int a){
        this.a=a;
    }
    void info(){
        System.out.println("VALUE OF A : "+a);
    }
}
class Two extends One{
   int b;
   Two(){
       super(7);//calling parent class constructor.
       this.b=-5;
   }
   Two(int b){
       super();
       this.b=b;
   }
   Two(int a,int b){
       this.b=b;
       this.a=a;
   }
   void info(){
       System.out.println("VALUE OF A : "+a);
       System.out.println("VALUE OF B : "+b);
   }
}
public class DemoInheritance2{
    public static void main(String[] args) {
        One Obj1=new One();
        One Obj2=new One(10);
        Two Obj3=new Two();
        Two Obj4=new Two(56);
        Two Obj5=new Two(11,19);
        Obj1.info();
        Obj2.info();
        Obj3.info();
        Obj4.info();
        Obj5.info();
    }


}
