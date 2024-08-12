//import java.util.*;
//public class Solution {
//
//    public static void main(String[] args) {
//        String text;
//        Scanner t=new Scanner(System.in);
//        text=t.nextLine();
//        int val;
//        val=t.nextInt();
//        String arr[] = text.split(" ");
//        if(val==1){
//            for(int i=1;i<arr.length;i+=2){
//
//                    char[] temp = arr[i].toCharArray();
//                    String str = new String(reverse(temp));
//                    arr[i] = str;
//
//                //System.out.println(arr[i]);
//            }
//        }
//        else{
//            for(int i=0;i<arr.length;i+=2){
//                char [] temp=arr[i].toCharArray();
//                String str = new String(reverse(temp));
//                arr[i] = str;
//                //System.out.println(arr[i]);
//            }
//        }
//        for (int i = 0; i<arr.length; i++){
//            if(i%2 != 0){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i]);
//            }
//            System.out.print(" ");
//        }
//    }
//    static char[] reverse(char []arr){
//        char temp;
//        for(int i=0;i<arr.length/2;i++) {
//                temp = arr[i];
//                arr[i] = arr[arr.length - 1 - i];
//                arr[arr.length - 1 - i] = temp;
//        }
////        System.out.println(arr);
//        return arr;
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//        scan.close();
//    }
//}
class Solution {
    static int leftSum(int index,int[] arr){
        int sum=0;
        for(int i=index-1;i>=0;i--){
            sum+=arr[i];
        }
        System.out.println("left:"+sum);
        return sum;
    }
    static int rightSum(int index,int[] arr){
        int sum=0;
        for(int i=index+1;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("right:"+sum);
        return sum;
    }
    public static int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(leftSum(i,nums)-rightSum(i,nums));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));

    }
}