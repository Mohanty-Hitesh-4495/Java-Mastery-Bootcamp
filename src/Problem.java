import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        System.out.println("ENTER THE NUMBERS :");
        N=sc.nextInt();
        M=sc.nextInt();
        int d,c=0;
        int result=0;
        while(N!=0){
            d=N%10+M;
            result=(int)((d%10)*Math.pow(10,c)+result);
            c++;
            N/=10;
        }
        System.out.println(result);
    }
}
