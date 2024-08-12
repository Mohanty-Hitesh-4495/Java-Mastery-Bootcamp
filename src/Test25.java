import java.util.Scanner;

public class Test25 {
    static boolean checkPalindrome(String str){
        for(int i=0,j=str.length()-1;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
    static String evenUpperCase(String str){
        StringBuilder result=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2==0){
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        str=new String(result);
        return str;
    }
    static String oddUpperCase(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2!=0){
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        str=new String(result);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str= sc.nextLine();
        System.out.println("1.Palindrome");
        System.out.println("2.Even UpperCase");
        System.out.println("3.Odd UpperCase");
        System.out.println("\n ENTER YOUR CHOICE : ");
        int opt=sc.nextInt();
        switch (opt){
            case 1-> System.out.println(checkPalindrome(str));
            case 2-> System.out.println(evenUpperCase(str));
            case 3-> System.out.println(oddUpperCase(str));
            default -> System.out.println("invalid choice");
        }
    }
}
