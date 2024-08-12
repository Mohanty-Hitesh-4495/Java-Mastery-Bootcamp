package ExamPrep.Module2;

import java.util.Scanner;
/*
    Imagine you have an abstract class called "Bank" that offers functionality to
    determine the rate of interest through the method interestRate(). Now,
    generate subclasses named SBI, ICICI, and AXIS banks. These subclasses
    should specify interest rates of 8%, 7.5%, and 9%, respectively. Write a java
    program for it.
 */
abstract class Bank {
    static float interest;// rate of interest
    static float pa;// principal amount
    static float time;// time span
    public abstract float getInterest();
}
class SBI extends Bank{
    @Override // rate of interest of SBI bank = 8
    public float getInterest(){
        interest=8;
        return (pa*time*interest)/100;
    }
}
class ICICI extends Bank{
    @Override // rate of interest of ICICI bank = 7.5
    public float getInterest(){
        interest=7.5f;
        return (pa*time*interest)/100;
    }
}
class Axis extends Bank{
    @Override // rate of interest of Axis bank = 9
    public float getInterest(){
        interest=9;
        return (pa*time*interest)/100;
    }
}
public class DemoBank{
    public static void main(String[] args) {
        SBI ob1 = new SBI();
        Axis ob2 = new Axis();
        ICICI ob3 = new ICICI();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE PRINCIPLE AMOUNT : ");
        Bank.pa=sc.nextFloat();
        System.out.print("ENTER THE TIME DURATION (IN YEAR) : ");
        Bank.time=sc.nextFloat();
        System.out.println("SBI INTEREST AMOUNT : "+ob1.getInterest());
        System.out.println("AXIS INTEREST AMOUNT : "+ob2.getInterest());
        System.out.println("ICICI INTEREST AMOUNT : "+ob3.getInterest());


    }
}
