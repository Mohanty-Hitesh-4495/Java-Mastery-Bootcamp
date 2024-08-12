import java.util.Scanner;

public class CodeWord {
    public static void main(String[] args) {
//        char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] code={'q','w','e','f','r','t','y','u','i','o','p','a','s','d','g','h','j','k','l','z','x','c','v','b','n','m'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code : ");
        String text= sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<text.length();i++){
            int index;
            if((int)text.charAt(i)<97)
                index= (int)(text.charAt(i))-65;
            else
               index= (int)(text.charAt(i))-97;
            if(text.charAt(i)==' ')
                result.append(' ');
            else
                result.append(code[index]);
        }
        System.out.println(result);
    }
}
