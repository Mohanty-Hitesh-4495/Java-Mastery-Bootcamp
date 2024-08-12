package ExamPrep.Module2;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Write a Java program to calculate the ratio of male to female voters among N
    voters of class “Voter” with instance variables ‘name’ and ‘gender’.
 */

class Voter {
    int age;// age of voter
    String mf;// male or female
    void setPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("AGE:");
        this.age= sc.nextInt();
        sc.nextLine();
        System.out.print("Gender(m/f) : ");
        this.mf=sc.nextLine();
    }
    // check the eligibility of voter
    boolean checkEligible(){
        return age >= 18;
    }
}
public class DemoVoter {
    // return the gcd of male and female count
    static int getGcd(int a, int b){
        if(b==0)
            return a;
        return getGcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voter ob = new Voter();
        ArrayList<Voter> voterList =new ArrayList<>();
        int voter,male=0,female=0;
        System.out.print("Enter the number of voter :");
        voter=sc.nextInt();
        for(int i=0;i<voter;i++){
            System.out.println("PERSON ("+(i+1)+")");
            ob.setPerson();
            voterList.add(ob);
            if(ob.mf.equalsIgnoreCase("m") && ob.checkEligible())
                male++;
            if(ob.mf.equalsIgnoreCase("f") && ob.checkEligible())
                female++;
        }
        System.out.println("MALE VOTERS: "+male);
        System.out.println("FEMALE VOTERS: "+female);
        int d=getGcd(male,female);
        System.out.println("RATIO OF MALE AND FEMALE VOTERS = "+male/d+":"+female/d);
    }
}
