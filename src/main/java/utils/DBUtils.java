package utils;

import java.sql.*;

public class DBUtils {

	private static Connection conn;
	private final static String url = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true"; 
	private final static String username = "root"; 
	private final static String password = "root"; 
	
	public static void establishConnection() throws SQLException
	{
		conn = DriverManager.getConnection(url,username,password);
	}
	
	public static Connection getConnection() throws SQLException
	{
		return conn;
	}
	
	public static void closeConnection() throws SQLException
	{
		if(conn!=null)
			conn.close();
	}
	
}
