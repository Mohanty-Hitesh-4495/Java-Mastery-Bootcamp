package Overloading_Override;

import java.util.Scanner;
// write an example program to demonstrate
// constructor overloading, method overloading and method overriding.

 class NewTask {
    int eid,salary;
    String name;
    NewTask() {

    }
    NewTask(int eid,String des,int salary){
        this.eid=eid;
        this.name =des;
        this.salary=salary;
    }
    void setEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER EMPLOYEE ID : ");
        this.eid=sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER NAME : ");
        this.name = sc.nextLine();
        System.out.print("ENTER THE SALARY : ");
        this.salary= sc.nextInt();
        sc.close();
    }
    void setEmployee(int id,String des,int salary){
        this.eid=id;
        this.name =des;
        this.salary=salary;
    }
    void getEmployee(){
        System.out.println("EMPLOYEE ID :"+eid);
        System.out.println("NAME :"+ name);
        System.out.println("SALARY :"+salary);
        System.out.println();

    }
}
class NewTask2 extends NewTask{
     @Override
     void getEmployee(){
         System.out.println("EMPLOYEE ID :"+eid);
         System.out.println("SALARY :"+salary);
         System.out.println("NAME :"+ name);
         System.out.println();
     }
}
public class DemoExample{
    public static void main(String[] args) {
        NewTask ob1 = new NewTask();
        NewTask ob2 = new NewTask(1,"HITESH MOHANTY",54000);
        NewTask2 ob3 = new NewTask2();
        ob1.setEmployee(2,"BIKASH GHADAI",69000);
        ob3.setEmployee();
        ob2.getEmployee();
        ob1.getEmployee();
        ob3.getEmployee();
    }
}
