package OOPs;

import java.util.*;
 class Complex{
    double real,imaginary;
    Complex(){}//default constructur
    Complex(double r,double i){//parametric constructur
        this.real=r;
        this.imaginary=i;
    }    
    void display(){//display method
        if(imaginary>=0){
            System.out.println(real+" +i "+imaginary);
        }
        else
            System.out.println(real+" -i "+(-imaginary));
    }
     static Complex addComplex(Complex A, Complex B){//OOPs.Complex is the return type for adding two complex no.s
        Complex sum=new Complex();//static is used to call a method without any object.
        sum.real=A.real+B.real;
        sum.imaginary=A.imaginary+B.imaginary;
        return sum;
    }
     Complex addComplex(Complex A){//method overloading
         Complex sum=new Complex();
        sum.real=A.real+real;
        sum.imaginary=A.imaginary+this.imaginary;
        return sum;   
    }
}
public class DemoComplex{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER THE FIRST COMPLEX NUMBER = ");
            System.out.print("REAL NUMBER = ");
            double r=sc.nextDouble();
            System.out.print("IMAGINARY NUMBER = ");
            double i=sc.nextDouble();
            Complex M=new Complex(r,i);//M is a object
            System.out.println("ENETER THE FIRST COMPLEX NUMBER = ");
            System.out.print("REAL NUMBER = ");
            double r2=sc.nextDouble();
            System.out.print("IMAGINARY NUMBER = ");
            double i2=sc.nextDouble();
            Complex N=new Complex(r2,i2);//N is a object

            System.out.println("GIVEN COMPLEX NUMBER...");
            M.display();
            N.display();
            Complex R=new Complex();
            R= Complex.addComplex(M,N);//calling addComplex method from OOPs.Complex class
            System.out.println("RESULTANT COMPLEX NUMBER FROM STATIC METHOD...");
            R.display();
            System.out.println("RESULTANT COMPLEX NUMBER FROM UNSTATIC METHOD...");
            R.addComplex(M);
            R.display();
            sc.close();
        }
    }
