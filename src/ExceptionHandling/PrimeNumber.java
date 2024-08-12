package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class PrimeException extends Exception{
    PrimeException(String message){
        super(message);
    }
}
public class PrimeNumber {
    static boolean checkPrime(int a){
        for (int i = 2; i <Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws PrimeException {
        Scanner sc = new Scanner(System.in);
        int f=0;
        while(f==0) {
            try {
                System.out.println("ENTER A NUMBER :");
                int a = sc.nextInt();
                if(a<2){
                    throw new PrimeException("INVALID NUMBER TO CHECK FOR PRIME NUMBER");
                }
                System.out.println(checkPrime(a));
                f++;
            }
            catch (PrimeException | InputMismatchException e){
//                e.printStackTrace();
                System.out.println("jaa maghia");
                sc.nextLine();

            }
        }
    }
}
