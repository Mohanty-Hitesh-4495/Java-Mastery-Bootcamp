package Assignment;
import java.util.*;
public class Prime{
    static boolean prime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int s,e;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STARTING RANGE= ");
        s=sc.nextInt();
        System.out.print("ENTER THE ENDING RANGE= ");
        e=sc.nextInt();
        System.out.println("PRINTING THE PRIME NUMBERS IN RANGE OF ("+s+"-"+e+")");
        for(int i=s;i<=e;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }

    }

}
