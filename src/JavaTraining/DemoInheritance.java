class A5{
    public void x1(Object ob){
        System.out.println(1);
    }

    public void x1(String s1){
        System.out.println(2);
    }
}
public class DemoInheritance {
    public static void main(String[] args) {
        A5 ob=new A5();
        ob.x1(null);//null value goes to string parametrized x1 method.
        // since string class is a child class of Object class.
        // it will check whether it will take input or not.
        // if not then it will ask its parent class to take input.
        //
    }
}
