package Pc;
public class Parent {
    int a;
    Parent(){

    }
    void set(int x){
        this.a=x;
    }
    void info(){
        System.out.println("Pc.Parent Object: Field a = "+this.a);
    }
}
