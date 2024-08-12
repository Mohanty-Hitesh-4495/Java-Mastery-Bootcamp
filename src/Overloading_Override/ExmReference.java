package Overloading_Override;

import java.util.*;
public class ExmReference {
    int a;
    void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AN INTEGER= ");
        this .a=sc.nextInt();
       // sc.close();
    }
    void info(){
        System.out.println("a="+a);
    }
}
