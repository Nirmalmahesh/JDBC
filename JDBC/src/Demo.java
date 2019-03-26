//importing the package
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:sqlserver://localhost:1433; databaseName=Test";
		String username = "sa";
		String password = "joker";
     	//Load and Register the Driver	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//Establish the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		//Create the Statment
		Statement st = con.createStatement();
		//Execute the query
		//Execute Query Only returns the resultset oject but while insert data we have to know how many roes affected so we need to use executeUpdate Methord
		int count = st.executeUpdate("insert into demo values('2','Ramesh','MBA')");
		
		System.out.println(count+" Rows Affected");
			
		//Close Connection
		st.close();
		con.close();
	}

}
