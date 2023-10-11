package com.hiber4.demo;


/**
 * Hello world!
 *
 */

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hiber4.demo.daoimpl.StudentDaoImpl;

public class App 
{
	public static void main( String[] args )
	{
		char a;
    	
		StudentDaoImpl impl=new StudentDaoImpl();
    	
		do
    	{
			Scanner sc=new Scanner(System.in);
    		
			System.out.println("Student Details");
    		System.out.println("1. Display 2. Add 3. Edit 4. Delete 5. Exit");
    		System.out.println("Enter your choice");
    		
    		int ch=sc.nextInt();
    		
    		switch(ch){
    			case 1: {
    				impl.displayStd();
    				break;	
    			}
    			
    			case 2:{
    				impl.addStd();
    				break;
    			}
    		
    			case 3:{
    				impl.editStd();
    				break;
    			}
    		
    			case 4:{
    				impl.deleteStd();
    				break;
    			}
    			
    			case 5:
    				System.exit(0);
    				break;
    			}
    		
    			System.out.println("Do you want to continue Y/N");
    		
    			a=sc.next().charAt(0);
    		
    		}
		
		while(a=='Y' || a=='y');
		
		System.out.println("Thank you");
		
	}

}