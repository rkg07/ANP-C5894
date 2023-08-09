package Collection;

/*
 Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
 Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class 
 and implement the abstract methods. Write a Java program to demonstrate starting 
 and stopping operations for a car and a motorcycle.
 */

abstract class Vehicle 
{
	public abstract void start();
	
	public abstract void stop();
		
}

class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car Start when Fuel is filled ");
	}
	
	public void stop()
	{
		System.out.println("Car Stop when breaks are applyed ");
	}
}

class Motorcycle extends Vehicle
{
	public void start()
	{
		System.out.println("Motorcycle Start when Fuel is filled ");
	}
	
	public void stop()
	{
		System.out.println("Motorcycle Stop when breaks are applyed ");
	}
}

class VehicleMain
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.start();
		c.stop();
		
		Motorcycle m = new Motorcycle();
		m.start();
		m.stop();
		
	}

}
