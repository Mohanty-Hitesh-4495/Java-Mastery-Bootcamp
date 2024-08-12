package OOPs;// write a program to create three different objects of OOPs.Time class in 24-hour format.
// and display in am/pm format.

public class DemoTime {
    public static void main(String[] args) {

        Time ob1=new Time();
        Time ob2=new Time();
        Time ob3=new Time();
        ob1.setTime(23,45);
        ob1.time();
        ob2.setTime(15,23);
        ob2.time();
        ob3.setTime(8,56);
        ob3.time();
    }
}
class Time {
    int hour,min;
    public void setTime(int h,int m){
        this.hour=h;
        this.min=m;
    }
    public void time(){
        if(hour<12){
            System.out.println("TIME = "+hour+":"+min+"am");
        } else if (hour == 12) {
            System.out.println("TIME ="+hour+":"+min+"pm");
        } else{
            System.out.println("TIME = "+(hour-12)+":"+min+"pm");
        }
    }
}
