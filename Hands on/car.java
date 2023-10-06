package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class car
{
	static String fqcn = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306?user=carwale &password=Rutik@07";
	static PreparedStatement pstmt = null;
	static Connection con = null;

	static Scanner sc = new Scanner(System.in);

	public static void sell()
	{
		System.out.println("Enter id :");
		int cid = sc.nextInt();

		System.out.println("Enter name :");
		String cname = sc.next();

		System.out.println("Enter brand :");
		String cmodel = sc.next();

		System.out.println("Enter price :");
		String cprice = sc.next();

		String inqry = "insert into carwale.cars values(?,?,?,?)";
	   
		try 
		{
			Class.forName(fqcn);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(inqry);
			pstmt.setInt(1, cid);
			pstmt.setString(2, cname);
			pstmt.setString(3, cmodel);
			pstmt.setString(4, cprice);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			if (pstmt != null || con != null)
			{
				try
				{
					pstmt.close();
					con.close();
					
				}
				
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
			}
			
		}
		
	}

	public static void buy() 
	{
		String delqry = "delete from carwale.cars where cno=?";
		String disqry = "select * from carwale.cars";
		
		try 
		{
			Class.forName(fqcn);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(disqry);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) 
			{
				System.out.println("Car Id: " + rs.getInt(1));
				System.out.println("Car Name: " + rs.getString(2));
				System.out.println("Car Model: " + rs.getString(3));
				System.out.println("Car Price: " + rs.getString(4));
				System.out.println("==============");
				
			}
			
			pstmt = con.prepareStatement(delqry);
			System.out.println("Enter the Car Id which you want to buy :");
			
			int cid = sc.nextInt();
			
			pstmt.setInt(1, cid);
			pstmt.executeUpdate();
			
			System.out.println("Congratulations!! on your new car");
				
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	public static void see() 
	{
		String upqry = "select * from carwale.cars ";
		
		try 
		{
			Class.forName(fqcn);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(upqry);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) 
			{
				System.out.println("Car Id: " + rs.getInt(1));
				System.out.println("Car Name: " + rs.getString(2));
				System.out.println("Car Model: " + rs.getString(3));
				System.out.println("Car Price: " + rs.getString(4));
				System.out.println("==============");
				
			}
			
			
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			if (pstmt != null || con != null)
			{
				try
				{
					pstmt.close();
					con.close();
					
				} 
				
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
			}
			
		}
		
	}
	
	public static void seeLatest()
	{
		String upqry = "select * from carwale.latestcars";
		
		try
		{
			Class.forName(fqcn);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(upqry);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				System.out.println("Car Id: " + rs.getInt(1));
				System.out.println("Car Name: " + rs.getString(2));
				System.out.println("Car Model: " + rs.getString(3));
				System.out.println("Car Price: " + rs.getString(4));
				System.out.println("==============");
				
			}

			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
			
		finally
		{
			if (pstmt != null || con != null)
			{
				try 
				{
					pstmt.close();
					con.close();
					
				} 
				
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to CarWale");
		System.out.println("Press 1 to sell a car");
		System.out.println("Press 2 to buy a car");
		System.out.println("Press 3 to see cars");
		System.out.println("Press 4 to see latest car");
		
		int a = sc.nextInt();
			
		switch (a) 
		{
		
		case 1:
			System.out.println("You have to sell a car");
			sell();
		break;

		case 2:
			System.out.println("You have to buy a car");
			buy();
		break;

		case 3:
			System.out.println("You have to see all the cars");
			see();
		break;
				
		case 4:
			System.out.println("You have to see latest cars");
			seeLatest();
		break;

		default:System.out.println("Please select from above options");
		break;
			
		}
		
	}	
	
}