package ExamPrep.Module1;
import java.util.Scanner;

// Write a Java program that prompts the user to input a range and
// then prints all the prime numbers within that range.

public class PrimeNumber {
    static boolean prime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start,end;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STARTING RANGE= ");
        start=sc.nextInt();
        System.out.print("ENTER THE ENDING RANGE= ");
        end=sc.nextInt();
        System.out.println("PRINTING THE PRIME NUMBERS IN RANGE OF ("+start+"-"+end+")");
        for(int i=start;i<=end;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

}
