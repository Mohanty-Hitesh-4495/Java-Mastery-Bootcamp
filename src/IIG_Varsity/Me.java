package IIG_Varsity;

class Bbsr{
    public int Dinner(){
        int total=3*500;
        System.out.println("DINNER COST = "+ total);
        return total;
    }
}
class Khordha{
    public int Lunch() {
        int total2 = 5*200;
        System.out.println("LUNCH COST = "+total2);
        return total2;
    }
}
class RamBhai{
    public int cake(){
        int total3=300+500;
        System.out.println("CAKE COST = "+total3);
        return total3;
    }
}
public class Me {
    public static void main(String[] args) {
        int totalExp;
        Bbsr ob1= new Bbsr();
        Khordha ob2=new Khordha();
        RamBhai ob3=new RamBhai();
        totalExp= ob1.Dinner() + ob2.Lunch() +ob3.cake();
        System.out.print("TOTAL EXPENSE OF BIRTHDAY: ");
        System.out.println(totalExp);
    }
}
