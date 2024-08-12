
class Book{
    String name;
    int page;
    Book(String name,int num){
        this.name=name;
        this.page=num;
    }
    void show(){
        System.out.println(name);
    }
}
public class BookPrice {
    static void leastPage(Book ob1,Book ob2,Book ob3){
        if(ob1.page<ob2.page){
            if(ob1.page<ob3.page){
                ob1.show();
            }
            else{
                ob3.show();
            }
        }else {
            if(ob2.page< ob3.page){
                ob2.show();
            }else {
                ob3.show();
            }
        }
    }
    public static void main(String[] args) {
        Book ob1 = new Book("Three Mistake of My Life",758);
        Book ob2 = new Book("Gulliver's Travel",258);
        Book ob3 = new Book("3 Idiots",984);
        leastPage(ob1,ob2,ob3);
    }
}
