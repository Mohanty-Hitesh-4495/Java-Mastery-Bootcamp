import java.util.Arrays;

public class FullAdder {
    static boolean[] halfAdder(boolean A,boolean B,boolean Cin){
        boolean[] sumCarry = new boolean[2];
        sumCarry[0]=(A!=B);
        sumCarry[1]=((A&B)||((A&B)&(A^B)));
        return sumCarry;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(halfAdder(false,false,false)));
        System.out.println(Arrays.toString(halfAdder(false,false,true)));
        System.out.println(Arrays.toString(halfAdder(false,true,false)));
        System.out.println(Arrays.toString(halfAdder(false,true,true)));
        System.out.println(Arrays.toString(halfAdder(true,false,false)));
        System.out.println(Arrays.toString(halfAdder(true,false,true)));
        System.out.println(Arrays.toString(halfAdder(true,true,false)));
        System.out.println(Arrays.toString(halfAdder(true,true,true)));
    }
}
