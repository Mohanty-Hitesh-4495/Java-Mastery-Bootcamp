package Pc;

public class Child extends Parent {
    int a;
    Child(){

    }
    void set(int x,int y){
        this.a=y;
        super.a=x;//this could not be possible as 'a' variable is private in Pc.Parent class...
//      super.set(x);
        /*since set method in Pc.Parent class is default we can access the 'a' variable
        from parent class using set method...*/
    }
    void info(){
        super.info();
        System.out.println("Pc.Child Object Field a = "+this.a);
    }
}
