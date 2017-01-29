package main.java.com.petros.diplomatiki.testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class App {

		public static void main(String[] args)  {

			String url = "jdbc:mysql://localhost:3306/RentACar?useSSL=false";
			String user =  "root";
			String pass =  "12345";

			// 1. Get a Connection to a database
			try {
				Connection myConn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connected wohoooo !!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
