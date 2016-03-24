package Database;

import java.awt.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.*;

public class dbConnections{
	
	public void Connect(){

		//Prepare connection
		Connection con;
		Statement s;
		ResultSet rs = null;
		
		//Try reach database
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println("can't make connection");
		}
		//try get data
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost/cards","root","");
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM card");

			while(rs.next())
			{
				String id = rs.getString("ID");
				String name = rs.getString("Name");
				String type = rs.getString("Type");
				String cost = rs.getString("Cost");
				String ab = rs.getString("Abilitys");
				String amount = rs.getString("Amount");
				System.out.println(id +" | "+ name + type +" | "+ cost + " | "+ ab +" | "+ amount);
			}
		}
		catch(Exception ex)
        {
            System.out.println("No data" + ex);
        }
	}

}