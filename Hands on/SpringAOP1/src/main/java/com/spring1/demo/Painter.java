package com.spring1.demo;

public class Painter implements Performer
{
	private Shape shape;
	
	public Painter()
	{
		super();
		// TODO Auto-generated constructor stub

	}
	
	public Painter(Shape shape)
	{
		super();
		this.shape = shape;
	
	}

	@Override
	public void perform() 
	{
		System.out.print("Painter is ");
		shape.draw();
		
	}
	
}


 