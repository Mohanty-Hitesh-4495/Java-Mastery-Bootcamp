package ExceptionHandling;

public class DemoException {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println(1);
            int b = 10 / a;
            System.out.println(b);
            System.out.println("Suiiiii");
        } catch(Throwable e){
            e.printStackTrace();
        }
        System.out.println("Suiiiii");
       try{
           int a=10/0;
           System.out.println("Good Morning");
       }catch (ArithmeticException e){
           e.printStackTrace();
           System.out.println(e);
           System.out.println(e.toString());
           System.out.println(e.getMessage());
       }
        System.out.println("Good Morning");

    }
}
