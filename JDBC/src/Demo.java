//importing the package
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/db_example";
		String username = "sa";
		String password = "joker";
     	//Load and Register the Driver	
		Class.forName("com.mysql.jdbc.Driver");
		//Establish the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		//Create the Statment
		Statement st = con.createStatement();
		//Execute the query
		ResultSet rs = st.executeQuery("select * from users");
		
		//Process ResultSet
	
		while(rs.next())
		{
			System.out.println("Id:"+rs.getInt(1)+" Name:"+rs.getString(3));
		}
		
		//Close Connection
		st.close();
		con.close();
	}

}
