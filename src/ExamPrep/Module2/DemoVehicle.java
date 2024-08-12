package ExamPrep.Module2;
/*
	Define a base class Vehicle with attributes like companyName and year. Car is
	a derived class extending Vehicle and adding an attribute color.
	SportsCar is further derived from Car and adds a new attribute speed. Write a
	Java program for displaying details of an object of SportsCar.
 */

class Vehicle{
	String comName;// company name
	int year;// year of manufacturing
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
