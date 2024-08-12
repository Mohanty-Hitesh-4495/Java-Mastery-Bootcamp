package OOPs;

class NumberSequence {
    static int n;
    NumberSequence(int a){
        n=a;
    }
    void increase(String name){
        for(int i=n;i<=2*n;i++){
            System.out.println(i+" "+name);
        }
    }
}
class MoyeThread extends Thread{
    NumberSequence N;
    String name;
    MoyeThread(NumberSequence A,String name){
        this.N=A;
        this.name=name;
    }
    synchronized public void run(){
        N.increase(name);
    }
}
public class DemoSequence{
    public static void main(String[] args) {
        NumberSequence A = new NumberSequence(100);
        NumberSequence B = new NumberSequence(500);
        MoyeThread ob1 = new MoyeThread(A,"OOPs.Thread1");
        MoyeThread ob2 = new MoyeThread(B,"OOPs.Thread2");
        try{
            ob1.start();
            ob1.join();
            ob2.start();
        }
        catch (Exception e){
            System.out.println("MOYE MOYE :(");
        }
    }
}