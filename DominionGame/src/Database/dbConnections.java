package Database;

import java.awt.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.*;

public class dbConnections{
	String DBPAD = "C:/Dominion.mdb";
	String DB = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" +DBPAD;
	
	public void Connect(){

		//Prepare connection
		Connection con;
		Statement s;
		ResultSet rs = null;
		
		//Try reach database
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException e){
			System.out.println("can't find a database");
		}
		//try get data
		try{
			con = DriverManager.getConnection(DB,"","");
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM Action-cards");
			
			while((rs!=null) && (rs.next()))
			{
			   System.out.println(rs.getString(1) + " : " + rs.getString(2));
			}
		}
		catch(Exception ex)
        {
            System.out.println("geen data");
        }
	}

}