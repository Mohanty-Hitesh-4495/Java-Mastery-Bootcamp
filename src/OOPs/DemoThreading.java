package OOPs;

// multithreading supports abstract class "Thread" and interface "Runnable"...
//Thread class have run() and start() methode while Runnable interface only supports run() method...
// start(),run(),getId(),setPriority(),setName(),getName()....this are the methods of thread class
public class DemoThreading {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
//        Thread3 T3 = new Thread3();
        Thread A = new Thread(T1);//start() method is not available in Runnable interface...
        Thread B = new Thread(T2);//assigning object of Thread(1,2,3) class to the object of Thread class
//        Thread C = new Thread(T3);
        T1.start();
        T2.run();
//        T3.run();
        A.start();
        B.start();
//        C.start();
//        A.setName("Sanjeeb");
//        System.out.println(A.getName());
//        System.out.println(A.getId());
//        B.setName("Sayed");
//        System.out.println(B.getName());
//        System.out.println(B.getId());
//        C.setName("Hitesh");
//        System.out.println(A.isDaemon());
//        System.out.println(C.getName());
//        System.out.println(C.getId());
    }
}
class Thread1 extends Thread {
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("Hi Sayed 1");
    }
}
class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("Hi Sanjeeb 2");
    }
}
//class Thread3 implements Runnable {
//    public void run(){
//        for(int i=0;i<100;i++)
//            System.out.println("Hi Hitesh 3");
//    }
//}