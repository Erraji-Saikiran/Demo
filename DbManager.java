import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class DbManager {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
	    //1. Loading Driver
	    Class.forName("com.mysql.cj.jdbc.Driver");
	   //2.creating the connection
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcore","root","root");
		//3.creating statement
		Statement stmt=con.createStatement();
   DatabaseMetaData metaData=con.getMetaData();
   System.out.println("DriverName"+metaData.getDriverName());
   System.out.println("Driver version"+metaData.getDriverVersion());
   System.out.println("UserName"+metaData.getUserName());
   
   ResultSet rset=stmt.executeQuery("select *from Trainer");
   ResultSetMetaData metaData2=rset.getMetaData();
    System.out.println(metaData2.getTableName(1));
    System.out.println(metaData2.getTableName(5));
    
    System.out.println("column count:"+metaData2.getColumnCount());
    
    System.out.println("column 1:"+metaData2.getColumnName(1));
    System.out.println("column 2:"+metaData2.getColumnName(2));
    System.out.println("column 3:"+metaData2.getColumnName(3));
    System.out.println("column 4:"+metaData2.getColumnName(4));
    
    rset.close();
    
    
	}

}
