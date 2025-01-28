import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//1.Loading Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2. Creating the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcore","root","root" );
				//3.creating Statement
				Statement stmt=con.createStatement();
				//4. Defining and executing query
				ResultSet rset=stmt.executeQuery("select * from student");
				
				//5. Printing the o/p
				while(rset.next())
					
				{
					System.out.println("---------------------------------------------------------");
					System.out.println(rset.getInt(1)+""+rset.getString(2)+" "+rset.getString(3)+" "+rset.getInt(4));
				    System.out.println("---------------------------------------------------------");
				}
				
				stmt.close();
				con.close();
				


	}

}
