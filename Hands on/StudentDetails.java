package JDBC;

/* 
 *A- create crud operation for students details accepting the input from user for confirming the operations.
 1.enter the student details, 
 2.retrive the students details,
 3.delete the students details, 
 4.edit the students details.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//SELECT * FROM student_records.student;
public class StudentDetails 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step 1		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_records", "root", "Rutik@07");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Available operations:");
        System.out.println("1. Enter the student details.");
        System.out.println("2. Retrieve the students details.");
        System.out.println("3. Delete the student details.");
        System.out.println("4. Edit the student details.");
        System.out.print("Enter the operation number: ");

        int operation = sc.nextInt();
        
        switch(operation)
        {
        case 1:
        	PreparedStatement pstmt=con.prepareStatement("Insert into student values(?,?,?,?)");
        	
        	System.out.println("Please enter the Student ID");
        	
        	int Student_Id = sc.nextInt();
        	
        	System.out.println("Please enter the Name");
        	String S_Name = sc.next();
        	
        	System.out.println("Please enter the Class");
        	int S_Class = sc.nextInt();
        	
        	System.out.println("Please enter the Grade");
        	String S_Grade = sc.next();
        	
        	// 3 step create statement
        	pstmt.setInt(1,Student_Id);
        	pstmt.setString(2,S_Name);
        	pstmt.setInt(3, S_Class);
        	pstmt.setString(4, S_Grade); 
        	
        	// 4 step execute query
        	int i = pstmt.executeUpdate();
        	System.out.println("Student data added successfully");
        	
        break;
        
        case 2:
        	PreparedStatement stmt1=con.prepareStatement("select * from student where Student_Id = ?");
        	
        	System.out.println("Please enter the Student ID");
    		
        	int Student_Id1 = sc.nextInt();
    		
        	stmt1.setInt(1, Student_Id1);
        	
        	ResultSet rs = stmt1.executeQuery();
        	
        	int S_class1;
    		String S_Nane1, S_Grade1;
    	
    		System.out.println("Students Details");
    		System.out.println("================");
    		
    		while(rs.next())
    		{
    			Student_Id1=rs.getInt(1);
    			S_Nane1=rs.getString(2);
    			S_class1=rs.getInt(3);
    			S_Grade1= rs.getString(4);
    			
    			System.out.println(Student_Id1+" "+S_Nane1+" "+S_class1+" "+S_Grade1+" ");
    		}
    		
    	break;
    	
        case 3:
        	PreparedStatement stmt=con.prepareStatement("delete from student where Student_Id =?");
        
        	System.out.println("Please enter the Student ID");
        	
        	int Student_Id2=sc.nextInt();
    	
    		stmt.setInt(1,Student_Id2);
    
    		// 4 step execute query
    		int a = stmt.executeUpdate(); 
    		
    		System.out.println("Student data deleted successfully.");
    	
    	break;
    	
        case 4:
       	 
       	 PreparedStatement statement = con.prepareStatement("UPDATE student SET S_Class = ? WHERE Student_Id = ?");
       	 
       	 System.out.println("Please enter the Class");
   		
       	 int S_Class2 = sc.nextInt();
   		 System.out.println("Please enter the Student ID :");
   		 
   		 int Student_Id3 = sc.nextInt(); 
   		
   		
   	 	statement.setInt(1, S_Class2);
   		statement.setInt(2, Student_Id3);
   		
   	    // 4 step execute query
   		int b = statement.executeUpdate(); 
   		
   		System.out.println("Student data updated Successfully!.");
   	
   		break;
   		
        default:
        	System.out.println("Error: Invalid operation number!..");
        	
        break;
    
        }
        
        //input for operation		
	    con.close();
	    sc.close();
	    
	}
	
}
