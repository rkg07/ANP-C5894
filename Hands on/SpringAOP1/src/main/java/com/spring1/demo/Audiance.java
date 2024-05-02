package com.spring1.demo;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audiance 
{
	@Pointcut("execution(* com.spring1.demo.Performer.perform(..))")
	void myPointcut()
	{
	}
	
	@Before("myPointcut()")
	public void switchOffCellPhs()
	{
		System.out.println("Audience Switching off cell phs.");
	}
	
	@Before("myPointcut()")
	public void takingSeats()
	{
		System.out.println("Audience Taking their Seats.");
	}
	
	@AfterReturning("myPointcut()")
	public void appluad()
	{
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("myPointcut()")
	public void demandRefund()
	{
		System.out.println("Boo we want our money back....");
	}
	
	/*
	 public void switchOffCellPhs(){
	 System.out.println("Audience Switching off cell phs."); } public void
	 takingSeats(){ System.out.println("Audience Taking their Seats."); } public
	 void appluad(){ System.out.println("CLAP CLAP CLAP!!!"); } public void
	 demandRefund(){ System.out.println("Boo we want our money back...."); }
	 */
}
