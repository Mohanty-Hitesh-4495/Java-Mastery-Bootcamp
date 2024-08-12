import java.util.*;
class ComplexNumber {
    double real,imaginary;
    ComplexNumber(){}
    ComplexNumber(double r, double i)
    {
        this.real=r;
        this.imaginary=i;
    }
    void set(double r, double i)
    {
        this.real=r;
        this.imaginary=i;
    }
    static void disp(ComplexNumber A)
    {
        if(A.imaginary>=0)
            System.out.println(A.real+" +i "+A.imaginary);
        else
            System.out.println(A.real+" -i "+(-A.imaginary));
    }
    static void Conj(ComplexNumber A, ComplexNumber B)
    {
        A.real=B.real;
        A.imaginary=-B.imaginary;
    }
}
public class Conjugate_Complex {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE REAL NUMBER = ");
        double r=sc.nextDouble();
        System.out.print("ENTER THE IMAGINARY NUMBER = ");
        double i=sc.nextDouble();
        ComplexNumber Z=new ComplexNumber(r,i);
        ComplexNumber.disp(Z);
        ComplexNumber Y=new ComplexNumber();
        ComplexNumber.Conj(Y,Z);
        ComplexNumber.disp(Y);
        sc.close();
}
}