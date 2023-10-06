package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPreparedStatementJdbc
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Rutik@07");

		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?)");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the ID");
		
		int id=sc.nextInt();
		
		System.out.println("Please enter the Name");
		String name=sc.next();
		
		System.out.println("Please enter the Designation");
		String desig=sc.next();
		
		System.out.println("Please enter the Salary");
		int sal=sc.nextInt();
	
		// 3 step
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3, desig);
		pstmt.setInt(4, sal); // create statement 
		
	    // 4 step
		int i=pstmt.executeUpdate();  // execute query
		System.out.println("Employee data added successfully");
		
		con.close();
		sc.close();
		
	}

}