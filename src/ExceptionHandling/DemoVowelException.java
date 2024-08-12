package ExceptionHandling;
import java.util.Scanner;

class VowelException extends Exception{
    public VowelException(String message){
        super(message);
    }
}
public class DemoVowelException {
    static boolean checkBoolean(String a){
        for(int i=0;i<a.length();i++){
            String value = Character.toString(a.charAt(i));
            if (value.equalsIgnoreCase("a")||value.equalsIgnoreCase("e")
                    ||value.equalsIgnoreCase("i")||value.equalsIgnoreCase("o")
                    ||value.equalsIgnoreCase("u")){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws VowelException {
        String line;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("ENTER A STRING VALUE : ");
            line=sc.nextLine();
            if(checkBoolean(line))
                System.out.println("String contains vowels :)");
            else
                throw new VowelException("STRING DOES NOT CONTAINS VOWELS");
        }
        catch (VowelException e){
            System.out.println("PLEASE ENTER A STRING WHICH CONTAINS VOWEL :(");
        }
    }
}
