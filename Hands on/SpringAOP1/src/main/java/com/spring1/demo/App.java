package com.spring1.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	//Ioc
    	ApplicationContext springContainer = new ClassPathXmlApplicationContext("bean.xml");
		
    	//Shape s1 = new Circle("red");
    	//s1.draw();
    	
    	Performer sp1=(Performer)springContainer.getBean("Padmaja");
    	sp1.perform();

    	//Performer sp2=(Performer)springContainer.getBean("Padmaja");
    	//sp2.perform();
    	
    }
    
}
