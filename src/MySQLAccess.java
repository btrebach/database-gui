import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.mysql.jdbc.MySQLConnection;

public class MySQLAccess {
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet rs = null;
  public static String sql = "";

	public void readDataBase() {
		try {
					    //jdbc:mysql://ipfromconnection:portnumber/databasename
			String URL = "jdbc:mysql://127.0.0.1:3306/Project1DB";
			String user = "root";
			String password = "";
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(URL, user, password);

			System.out.println("Creating statement...");
			statement = connect.createStatement();
			
			//sql must be written in MySQL
			//sql = "SELECT ID FROM Patients";
			rs = statement.executeQuery(sql);

		}

		catch (SQLTimeoutException ste) {
			System.out.println("TIMEOUT EXECPTION");
		}
		catch (SQLException se) {
			System.out.println("SQL EXECPTION");
			se.printStackTrace();
		}
		catch (Exception s) {
			System.out.println("EXECPTION");
		}

	}
	
	public ArrayList<String> getResult() throws SQLException{
		ArrayList<String> strings = new ArrayList<String>();
		while (rs.next()) {
			strings.add(rs.getString(1));
		}
		return strings;
	}
	
	
  
  public static void main(String[] args){
	
	 MySQLAccess x = new MySQLAccess();
	 x.readDataBase();

	}
  
}