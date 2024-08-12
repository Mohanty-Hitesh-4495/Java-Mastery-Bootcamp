package OOPs;

// write a java program where create a class "vehicle", which is extended by "car" class and furthur
// "car" is extended by "sportsCar".now display the details of sportsCar.
class Vehicle{
	String comName;
	int year;
	Vehicle(){}
	Vehicle(String name,int yr){
		this.comName=name;
		this.year=yr;
	}
}
class Car extends Vehicle{
	String colour;
	Car(){}
	Car(String name,int yr,String clr){
		super(name,yr);
		this.colour=clr;
	}
}
class SportsCar extends Car{
	int speed;
    SportsCar(){}
	SportsCar(String name,int yr,String clr,int speed){
		super(name,yr,clr);
		this.speed=speed;
	}
    void show(){
		System.out.println("COMPANY NAME : "+comName);
		System.out.println("YEAR  : "+year);
		System.out.println("COLOUR :"+colour);
		System.out.println("SPEED :"+speed);
	}
}
public class DemoVehicle{
	public static void main(String[] args){
		SportsCar ob = new SportsCar("lamborgini",2022,"green",220);
		ob.show();
	}
}
