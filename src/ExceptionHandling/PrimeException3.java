//package ExceptionHandling;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//class MyException extends Exception{
//    MyException(String message){
//        super(message);
//    }
//}
//public class PrimeException3 {
//    static boolean checkPrime(int a){
//        for(int i=2;i<=Math.sqrt(a);i++){
//            if(a%i  ==0)
//                return false;
//        }
//        return true;
//    }
//    static boolean checkOdd(int a){
//        while(a!=0){
//            int b=a%10;
//            if(b%2!=0){
//                return true;
//            }
//            a/=10;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) throws MyException {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER THE NUMBER : ");
//        int num=sc.nextInt();
//        try{
////            if(checkPrime(num)) {
////                if (checkOdd(num))
////                    System.out.println("Prime number and have odd digits");
////                else
////                    System.out.println("Prime number but not having odd digits");
////            }
////            else
//            if(num%5==0)
//                throw new InputMismatchException("not a prime number");
//            else
//                throw new MyException("jaa maghia");
//        }
//        catch (InputMismatchException e ){
//            System.out.println("NUMBER IS NOT A PRIME NUMBER!!!");
//            System.out.println("PLEASE TRY AGAIN");
////        }catch (MyException o){
////            System.out.println("habani jaa");
////        }
//
//    }
//}
