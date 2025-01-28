import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainerBatch {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		//1. Loading Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.creating the connection
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpcore","root","root");
     //3.creating statement
     Statement stmt=con.createStatement();
     /*stmt.addBatch("insert into Trainer values(212,'java','ms',50000)");
     stmt.addBatch("insert into Trainer values(213,'cc','Msc',50000)");
     stmt.addBatch("insert into Trainer values(214,'ml','btech',50000)");*/
     stmt.addBatch("update Trainer set salary=35000 where id=211");
     int[]arr=stmt.executeBatch();
     if(arr.length!=0) {
    	 System.out.println("The no.of records inserted/udated="+arr.length);
     }
     else
    	 System.out.println("There is some issue with sql commands");
     stmt.close();
     }
     		
		
		

	}


