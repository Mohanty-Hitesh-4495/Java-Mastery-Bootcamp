package Garbage_Collection;

public class DemoExample {

    public static void main(String[] args) {
        String s1 = new String();
        s1=null;
        System.gc();
//        Runtime r = Runtime.getRuntime();
//        r.gc();
        System.out.println("gc started-ended");
    }

    protected void finalize(){
        System.out.println("Finalize() is called");
    }
}
