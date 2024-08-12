package Class_And_Object;

class Points {
    float x,y,z;
    Points(){
    }
    Points(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void info(){
        System.out.println("["+this.x+","+this.y+","+this.z+"]");
    }
}
class Demo{
    public static void main(String[] args){
        Points P=new Points(2.0f,6.2f,5.32f);
        P.info();
        P.x=5.1f;
        P.y=6.2f;
        P.z=64.1f;
        P.info();
    }
}