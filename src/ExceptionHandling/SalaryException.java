package ExceptionHandling;
import java.util.Scanner;

class LessSalaryException extends Exception{
    public void show(){
        System.out.println("Ye bhi koi tareeka he bhik mang neka?");
    }
}
public class SalaryException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int sal = sc.nextInt();
        if(sal<10000){
            try{
//                int a=10/0;
                throw new LessSalaryException();
            } catch (LessSalaryException e) {
                e.show();
            }finally {
                System.out.println("Gareeb!!!");
            }
        }
    }
}
