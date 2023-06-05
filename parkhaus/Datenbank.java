package parkhaus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Datenbank {

	public static void main(String[] args) {
	     try
	        {
	            Class.forName("org.mariadb.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb","root","");
	            Statement stmt=con.createStatement();  
//	            System.out.println("Connected");  
	            
	            
	            ResultSet rs=stmt.executeQuery("select * from abteilung;");
	            
	            while(rs.next()) {

	               System.out.println( rs.getString("abt_name") + " " + rs.getString("standort")); 
	                

	                // etc.
	            }
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }  

	}


