package com.userregistration;
import java.sql.*;
public class TestConnectivity {

	
	public static void main(String[]args) throws ClassNotFoundException {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement stmt=null;
		String sql="Select * from user";
		try {
			//JDBC driver loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver loaded");
			//database connection
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/appmanagement","root","");
			//sql execution preparatioon
			stmt=(PreparedStatement) con.prepareStatement(sql);
			//get execution resulsts
			rs=stmt.executeQuery();
			while(rs.next()) {
				String id=rs.getString("id");
				String uname=rs.getString("username");
				String pwd=rs.getString("password");
				System.out.println("id:"+id+" ,username:"+uname+", Password:"+pwd);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("An error accured while loading the JDBC Drive");
		}
		catch(SQLException e) {System.out.println("An error accured while accessing the database");
		}
		finally {
			try {
				if(con!=null) {
			con.close();
				}
				}catch(SQLException e){
					System.out.println("An error accured while accessing the table");
			}
		}
		
	}
}
