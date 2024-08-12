import java.util.Arrays;

public class HalfAdder {
    static boolean[] halfAdder(boolean A,boolean B){
        boolean[] sumCarry = new boolean[2];
        sumCarry[0]=(A!=B);
        sumCarry[1]=(A&&B);
        return sumCarry;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(halfAdder(false,false)));
        System.out.println(Arrays.toString(halfAdder(false,true)));
        System.out.println(Arrays.toString(halfAdder(true,false)));
        System.out.println(Arrays.toString(halfAdder(true,true)));
    }
}
