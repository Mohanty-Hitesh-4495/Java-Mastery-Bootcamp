import java.util.*;
class Complexnum {
    double real,imaginary;
    Complexnum(){}//default constructor
    Complexnum(double r, double i){//parametric constructor
        this.real=r;
        this.imaginary=i;
    }    
    void display(){//method to display complex number...
        if(imaginary>=0){
            System.out.println(real+" +i "+imaginary);
        }
        else
            System.out.println(real+" -i "+(-imaginary));
    }
     void objdisplay(){//method to display conjugate of complex number...
        if(imaginary>=0){
            System.out.println(real+" -i "+imaginary);
        }
        else{
            System.out.println(real+" +i "+(-imaginary));
        }
    }
}
public class conjugate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE REAL NUMBER = ");
        double r=sc.nextDouble();
        System.out.print("ENTER THE IMAGINARY NUMBER = ");
        double i=sc.nextDouble();
        Complexnum M=new Complexnum(r,i);//M is a object.
        System.out.println("GIVEN COMPLEX NUMBER...");
        M.display();
        System.out.println("CONJUGATE OF COMPLEX NUMBER = ");
        M.objdisplay();
        sc.close();
    }

    
}
