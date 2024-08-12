package ParentChild;

public class ChildClass extends ParentClass{
    int b;
    ChildClass(){}
    void infoParent(){
        super.info();//using super keyword calling the info() method from ParentChild.ParentClass...
    }
    void info(){
        //System.out.println("Pc.Child Object: Field="+this.a);
        super.info();//this is a reference object for the object which is calling the method...
        //super is reference object of parent class...
        //super can be used within a child class only...
        System.out.println("Pc.Child Object: Field b= "+this.b);
    }
}
