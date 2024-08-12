package OOPs;

class MyGreet
{
    void goodMorning()
    {
        System.out.println("Good Morning");
    }

    static void goodBye()
    {
        System.out.println("Good bye");
    }
}
class DemoGreet{
    public static void main(String [] args){
            MyGreet obj= new MyGreet();
            obj.goodMorning();
            MyGreet.goodBye();
        }
    }