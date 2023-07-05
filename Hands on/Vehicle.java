package Oops;

class Vehicle 
{
	String brand;
	int year;
	public void displayinfo()
	{
		System.out.println("Brand and year of the vehicle");
	}
	
}

class Car extends Vehicle
{
	String model;
	//public void displayInfo()
	{
		System.out.println("Beand and year of the vehicle");
		
	}
}
class SportsCar extends Car
{
	int topspeed;
	
	public void displayinfo()

	{
		System.out.println("Brand,year,model and top speed of the sports car");
		
	}

}
class VehicleMain
{
		public static void main(String[] args) 
	{
			//creating object of sub class 
		SportsCar r=new SportsCar();
		
		r.brand="BMW";
		r.model="M3";
		r.year=2022;
		r.topspeed=310;
		
		System.out.println("Brand name is :" + r.brand);
		System.out.println("Model name is :" + r.model);
		System.out.println("Year :" + r.year);
		System.out.println("Top Speed :" + r.topspeed);
	

	}

}
