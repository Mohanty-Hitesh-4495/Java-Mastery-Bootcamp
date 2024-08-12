package OOPs;

// small sticker =5 ,big sticker=10
//small sticker 2,big sticker 3
class Sticker{
    String size;
    int price;
    Sticker(String s){
        this.size=s;
        if(size.equals("small"))
            this.price=5;
        else
            this.price=10;
    }
    int get_price(){
        return price;
    }

}
class DemoSticker{
    public static void main(String args[]){
        Sticker s1=new Sticker("small");
        Sticker s2=new Sticker("big");
        Sticker s3=new Sticker("small");
        Sticker s4=new Sticker("big");
        int total = s1.get_price()+s2.get_price()+s3.get_price()+s4.get_price();
        System.out.println("total = "+total);
    }
}