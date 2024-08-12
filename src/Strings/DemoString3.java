package Strings;// HOMEWORK: String s1="pkdixit58bbsr100000";
// String input format="name-age-address-salary"

import java.util.Scanner;

public class DemoString3 {
    public static void main(String[] args) {
        StringBuffer input=new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING :");
        input.append(sc.nextLine());
        StringBuffer name=new StringBuffer();
        StringBuffer age=new StringBuffer();
        StringBuffer add=new StringBuffer();
        StringBuffer salary=new StringBuffer();
        int check= 0;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                if(check<=1) {
                    age.append(input.charAt(i));
                    check = 1;
                }
                else
                    salary.append(input.charAt(i));
            }
            if(Character.isAlphabetic(input.charAt(i))){
               if(check==0)
                    name.append(input.charAt(i));
               else {
                   add.append(input.charAt(i));
                   check = 2;
               }
            }
        }
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
        System.out.println(salary);
    }
}
