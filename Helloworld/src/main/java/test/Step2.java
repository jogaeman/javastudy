package test;
//Step 1 Import SQL Packages
//import java.sql.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Step2 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Step 2 JDBC Driver Load
		String driverClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClass);
		
		
	}

}
