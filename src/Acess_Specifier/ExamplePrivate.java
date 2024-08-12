package Acess_Specifier;

class ExamplePrivate {
    private int a;
    void info(){
       System.out.println("a= "+a);
    }
   void set(int x){
    this.a=x;
    }
}
class DemoPrivate{
    public static void main(String[] args) {
        ExamplePrivate p=new ExamplePrivate();
        p.set(15);
        p.info();

    }

}
