package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbcDemo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Rutik@07");
		
		//step 3
		Statement stmt=con.createStatement();
		
		//step 4 execute Statement
		int a=stmt.executeUpdate("insert into employee values(3,'PK','VicePresident',334545)");
	
		System.out.println("Successfully added employee" +a);
		
		//step 5
		con.close();

	}
	
}







