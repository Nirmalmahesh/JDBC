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
		PreparedStatement st = con.prepareStatement("insert into demo values(?,?,?)");
		
		st.setInt(1, 3);
		st.setString(2, "Ranjith");
		st.setString(3, "MSC");
		int count = st.executeUpdate();
		System.out.println(count+" Rows Affected");
		
		//Execute the query
		
		
			
		//Close Connection
		st.close();
		con.close();
	}

}
