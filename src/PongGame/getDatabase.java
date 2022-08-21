package PongGame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getDatabase {
	private static String DB_URL = "jdbc:mysql://localhost:3306/infomation";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
	private static Connection conn = null;
    static PreparedStatement stmt = null;
    private static String text="";
    
    public static void insert(String ten, int cup) {
		try {
			Connection conn = Connections.getConnection(DB_URL, USER_NAME, PASSWORD);
			String sql = "INSERT INTO cupdata (name, cup)"
					+ "VALUES (?, ?)";
			PreparedStatement pstms = conn.prepareStatement(sql);
			pstms.setString(1, ten);
			pstms.setInt(2, cup);
			pstms.execute();
			System.out.println("Insert successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getName() {
        try {
          
            Connection conn = Connections.getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cupdata " 
            + "order by cup desc LIMIT 5");
            System.out.printf("%-20s %-20s" , "Ho Ten","Cup");
        	System.out.println ();
            // show data
            while (rs.next()) {
            	 int cup = rs.getInt("cup");
         		String tenString = rs.getString("name");
         		text += tenString + "     " + cup + "\n";
         		System.out.printf("%-20s", tenString);
         		System.out.printf("%-20s", cup);
         		System.out.println ();
            }
            setText(text);
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	 public static void main(String[] args) {
	    	new getDatabase();
	    	getDatabase.getName();
	    }

	public static String getText() {
		return text;
	}

	public static void setText(String text) {
		getDatabase.text = text;
	}

}
