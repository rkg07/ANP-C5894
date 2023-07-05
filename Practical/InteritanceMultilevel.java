package Oops;

//Example of Multilevel inheritance
//super class or base class or parent class
class AnimalLucy 
{
//fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal Eat....");
	}
}
//inherit from Animal
class Puppy extends AnimalLucy
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}
class Lucy extends Puppy
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	//fields & methods of Puppy class
		public void colour()
		{
			System.out.println("Black & white....");
		}
}
class PetLucy
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Lucy d=new Lucy();
		
		//access fields and methods
		d.name="Lucy";
		
		System.out.println("Name is:"+d.name);

		d.eat();
		d.sound();
		d.colour();
		
		
		
	}

}