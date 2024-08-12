import java.io.*;
public class Input2 {
    public static void main(String[] args)throws IOException {
        System.out.println("ENTER THE FIRST NUMBER = ");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String s1= br.readLine();
        int a=Integer.parseInt(s1);
        System.out.println("ENTER THE SECOND NUMBER = ");
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
        int total=a+b;
        System.out.println("TOTAL = "+total);
    }
}
