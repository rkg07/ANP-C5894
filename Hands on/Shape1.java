package Oops;

abstract class Shape1 
{
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
	
}
class Rectangle1 extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle is :1*b");
	}
	public void calculatePerimeter()
	{ 
		System.out.println("Preimeter of rectangle: 2(Length + Width)");

	}
} 

class Circle extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of circle is: πr2");
	}
	public void calculatePerimeter()
	{ 
		System.out.println("Perimeter of circle is: 2πr");

	}
} 
class Triangles extends Shape1
{
	public void calculateArea()
	{
		System.out.println("Area of Triangle is: (lxb)/2");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of Triangle is: a+b+c ");
	}
	
}
class ShapesMain
{
	public static void main(String[] args)
	{
		Rectangle1 r=new Rectangle1();
		r.calculateArea();
		r.calculatePerimeter();
		
		Circle c=new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		
		Triangles t=new Triangles();
		t.calculateArea();
		t.calculatePerimeter();
	
	
	}
}
