 import java.io.*;

 class Point1 {
     private float x,y,z;
     Point1(){}
     void showValue(){
         System.out.println("COORDINATE : "+"("+this.x+","+this.y+","+this.z+")");
     }
     float disFOr3(){
         return (float)Math.sqrt((double)(x*x+y*y+z*z));
     }
     float disFOr2(){
         return (float)Math.sqrt((double)(x*x+y*y));
     }
     float DisBetween(Point1 P1, Point1 P2){
         return (float)Math.sqrt(Math.pow((P1.getX()-P2.getX()), 2)
         +Math.pow(P1.getY()-P2.getY(),2)+Math.pow((P1.getZ()-P2.getZ()), 2));
     }
     void setX(float v){
         this.x=v;
     }
     void setY(float v){
         this.y=v;
     }
     void setZ(float v){
         this.z=v;
     }
     float getX(){
         return this.x;
     }
     float getY(){
         return this.y;
     }
     float getZ(){
         return this.z;
     }
 }

 public class PointTest {
     public static void main(String[] args)throws Exception{
         BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Number of POINTS : ");
         int n = Integer.parseInt(Br.readLine());
         Point1 PArr[] = new Point1[n];

         for(int i=0;i<n;i++){
             System.out.println("\nPOINT "+(i+1)+" : \n");
             Point1 P = new Point1();

             System.out.print("X : ");
             Float v0 = Float.parseFloat(Br.readLine());
             P.setX(v0);
             System.out.print("Y : ");
             Float v1 = Float.parseFloat(Br.readLine());
             P.setY(v1);
             System.out.print("Z : ");
             Float v2 = Float.parseFloat(Br.readLine());
             P.setZ(v2);

             PArr[i]=P;
         }

         for(int i=0;i<PArr.length;i++){
             PArr[i].showValue();
         }

     }
 }
