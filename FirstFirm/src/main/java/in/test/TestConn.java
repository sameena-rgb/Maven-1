package in.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestConn {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mov","root","sameena-rgb");
					System.out.println("Driver connected");
					Statement st=connection.createStatement();
					String str="insert into film2 values(101,'Rose','English',100)";
					st.execute(str);
					System.out.println("values inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
