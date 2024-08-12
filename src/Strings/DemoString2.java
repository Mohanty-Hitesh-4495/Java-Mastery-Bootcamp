package Strings;
// take a price from command prompt, and value must starts with "rs". take the quantity from the command prompt
// and find the total expense. now to the total add gst and gst must have taken from command prompt in decimal.
// find the total with two decimal values.
import java.util.Scanner;

public class DemoString2 {
    public static void main(String[] args) {
//        String price=args[0].substring(2);
//        String quantity=args[1];
//        String gst=args[2];
//        float total= (Float.parseFloat(price)*Float.parseFloat(quantity))+Float.parseFloat(gst);
//        System.out.printf("%.2f",total);

        String price;
        float quantity;
        float gst;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER PRICE : ");
        price=sc.nextLine();
        System.out.print("ENTER QUANTITY : ");
        quantity=sc.nextFloat();
        float cost=Float.parseFloat(price.substring(2));
        float total=cost*quantity;
        System.out.print("ENTER GST = ");
        gst=sc.nextFloat();
        total+=gst;
        System.out.printf("%.2f",total);
        System.out.println("TOTAL COST = "+total);
    }
}
