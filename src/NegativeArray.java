import java.util.Scanner;

// Write a program to print all negative numbers of an array...

public class NegativeArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("ENTER ELEMENTS TO THE ARRAY: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("NEGATIVE NUMBERS PRESENT IN ARRAY: ");
        for(int element:arr){
            if(element<0){
                System.out.print(element+" ");
            }
        }
    }
}