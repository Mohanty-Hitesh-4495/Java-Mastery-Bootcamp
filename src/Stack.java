import java.util.ArrayList;
import java.util.Scanner;

public class Stack {



    static void push(ArrayList<Integer> arr,int a){
        arr.add(a);
    }


    static void pop(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            System.out.println("Stack IS EMPTY !!!");
        }
        else{
            System.out.println(arr.get(arr.size()-1)+" is removed :)" );
            arr.remove(arr.size()-1);
        }
    }


    static void display(ArrayList<Integer> arr){
        for (Integer value: arr){
            System.out.print(value+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int opt;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("*** Main Menu ***");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("Enter your choice :");
            opt =sc.nextInt();
            switch (opt){
                case 1 -> {
                    try{
                        System.out.print("Enter the number to be pushed :");
                        int a=sc.nextInt();
                        push(arr,a);
                    }catch (Exception e){
                        System.out.println("Please Enter a valid input of integer type :(");;
                    }
                }
                case 2-> {
                    pop(arr);
                }
                case 3-> {
                    System.out.println("Displaying the stack");
                    display(arr);
                }
                default -> {
                    System.out.println("Enter a valid choice :)");
                }
            }

        }while (opt!=4);
    }
}
