package Oops;

class Shape 
{

	String name;
	public void calculateArea()
	{
		System.out.println("Calculating area of the shape");
		
	}
	
}

class Rectangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle");
	
	}
}

class ShapeMain
{
		
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		
		r.calculateArea();	
	}

}
