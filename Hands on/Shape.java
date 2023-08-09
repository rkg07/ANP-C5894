package Oops;

/*
 Create a superclass called "Shape" with properties like "numSides" and "color".
 Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" 
 and have additional properties like "sideLengths" for triangle and square, 
 and "radius" for the circle. Write a Java program to display the details of
  a triangle, a square, and a circle.
 */

class Shape
{
 	private int numSides;
 	private String color;
 	
 	public int getNumSides() {
 		return numSides;
 	}
 	public void setNumSides(int numSides) {
 		this.numSides = numSides;
 	}
 	public String getColor() {
 		return color;
 	}
 	public void setColor(String color) {
 		this.color = color;
 	}
 	   
}

class Triangle extends Shape
{
 	private int sideLengths;

 	public int getSideLengths() {
 		return sideLengths;
 	}

 	public void setSideLengths(int sideLengths) {
 		this.sideLengths = sideLengths;
 	}
 	
}

class Square extends Shape
{
 	private int sideLengths;

 	public int getSideLengths() {
 		return sideLengths;
 	}

 	public void setSideLengths(int sideLengths) {
 		this.sideLengths = sideLengths;
 	}
 	
}

class Circles extends Shape
{
 	private int radius;

 	public int getRadius() {
 		return radius;
 	}

 	public void setRadius(int radius) {
 		this.radius = radius;
 	}
 	
}

class ShapeMain
{
 	public static void main(String[] args) 
 	{
 		Triangle t=new Triangle();
 		t.setNumSides(3);
 		t.setColor("Purple");
 		t.setSideLengths(8);
 		
 		Square s=new Square();
 		s.setNumSides(4);
 		s.setColor("Red");
 		s.setSideLengths(6);
 		
 		Circles c=new Circles();
 		c.setNumSides(0);
 		c.setColor("Green");
 		c.setRadius(5);
 		
 		System.out.println("Details of a Triangle ");
 		System.out.println("Number of sides of traingle: " + t.getNumSides());
 		System.out.println("Color of traingle: " + t.getColor());
 		System.out.println("Side length of traingle: " + t.getSideLengths());
 		
 		System.out.println("Details of a Square ");
 		System.out.println("Number of sides of Square: " + s.getNumSides());
 		System.out.println("Color of Square: " + s.getColor());
 		System.out.println("Side length of Square: " + s.getSideLengths());
 		
 		System.out.println("Details of a Circle");
 		System.out.println("Number of sides of Circle: " + c.getNumSides());
 		System.out.println("Color of Circle: " + c.getColor());
 		System.out.println("Radius of Circle: " + c.getRadius());
 	}
 	
}
