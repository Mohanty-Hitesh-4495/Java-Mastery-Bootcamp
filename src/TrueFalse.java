import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        String input;
        Scanner sc =new Scanner(System.in);
        boolean bol;
        while(true) {
            System.out.println("ENTER YES OR NO : ");
            input=sc.next();
            if(input.equalsIgnoreCase("YES") ) {
                bol=true;
                break;
            }
            else if(input.equalsIgnoreCase("no")){
                bol=false;
                break;
            }
            else {
                System.out.println("INVALID ANSWER !!!");
            }
        }
        System.out.println("BOOLEAN = "+ bol);
    }
}
