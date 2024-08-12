package Class_And_Object;

class Book{
    float price;
    String book_name;
    int pages;
    Book(){}
    Book(String name,float price,int pages){
        this.book_name=name;
        this.price=price;
        this.pages=pages;
    }
    void display(){
        System.out.println("BOOK NAME ="+book_name+"\nBOOK PRICE ="+price+"\nBOOK PAGES ="+pages);
    }
}
class Classbook{
    public static void main(String[] args) {
        Book N=new Book("THREE MISTAKES OF MY LIFE",254.36F,982);
        N.display();
    }
}