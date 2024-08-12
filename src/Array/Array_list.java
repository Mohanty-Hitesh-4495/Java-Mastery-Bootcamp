package Array;
import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
    ArrayList <String> A=new ArrayList<>();
    A.add("Prakash");//add(integer)
    A.add("Sahil");
    A.add("Jadu");
    System.out.println("FRIENDS LIST ="+A);
    A.set(2,"Debasis");//set(index,integer)
    System.out.println("UPDATED LIST ="+A);//get()
        A.size();
    }
  
}
