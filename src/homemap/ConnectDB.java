package homemap;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectDB {
	private Connection con = null ;
	
	public ConnectDB() {
		try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homemap_database?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "Filter160Kratki");
			
			if( this.con != null) {
				System.out.println("Database is connected.");
			}	
		}
		
		catch(Exception e) {
			System.out.println("Database is not connected.");
			e.printStackTrace();
		}
	}
	
	public boolean insert_user(String firstName , String lastName , int age , String userType){
		try {
			Statement stmt = this.con.createStatement();
			String strSelect = "insert into usertable(firstName,lastName,age,userType) values('"+firstName+"','"+lastName+"',"+Integer.toString(age)+",'"+userType+"')";
			stmt.executeUpdate(strSelect);
		}
		catch(Exception e){
			e.printStackTrace() ;
			return false ;
		}		
		
		return true ;
	}	
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		
	}
}

