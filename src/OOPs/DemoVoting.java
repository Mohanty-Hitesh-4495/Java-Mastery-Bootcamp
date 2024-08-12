package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

// write a java program to take 10 voters age and gender.
// and check their eligibility(>18) and give ratio of male:female voters.

class Person{
    int age;
    String mf;
    void setPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("AGE:");
        this.age= sc.nextInt();
        sc.nextLine();
        System.out.print("MALE/FEMALE : ");
        this.mf=sc.nextLine();
    }
    boolean checkEligible(){
        return age >= 18;
    }
}
public class DemoVoting {
    static int getGcd(int a, int b){
        if(b==0)
            return a;
        return getGcd(b,a%b);
    }
    public static void main(String[] args) {
        Person ob = new Person();
        ArrayList<Person> arr=new ArrayList<>();
        int male=0,female=0;
        System.out.println("ENTER 10 PERSON VOTING DETAILS");
        for(int i=0;i<10;i++){
            System.out.println("PERSON ("+(i+1)+")");
            ob.setPerson();
            arr.add(ob);
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
