import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//insert records to the Trainer Table
public class TrainerApplication {

	static Connection connection = null;
	PreparedStatement pst = null;
	Scanner sc = null;

	void insertTeacher(Connection connection) throws SQLException {

		pst = connection.prepareStatement("insert into Trainer values (?,?,?,?,?) ");
		sc = new Scanner(System.in);
		Trainer t = new Trainer();
		System.out.println("Enter Trainer id");

		t.setTid(sc.nextInt());

		System.out.println("Enter Trainer name");

		t.setTname(sc.next());
		System.out.println("Enter Trainer qualification");

		t.setQualification(sc.next());

		System.out.println("Enter Trainer salary");
		t.setSalary(sc.nextInt());

		System.out.println("Enter Trainer courseId");
		t.setCourseId(sc.nextInt());

		pst.setInt(1,t.getTid());
		pst.setString(2,t.getTname());
		pst.setString(3,t.getQualification());
		pst.setInt(4,t.getSalary());
		pst.setInt(5,t.getCourseId());
		int i = pst.executeUpdate();
		if (i != 0)
			System.out.println("1 Record inserted");
		else
			System.out.println(" Record not inserted");
		pst.close();
		// con.close();

	}

	void updateTeacher(Connection connection) throws SQLException {
		System.out.println("Enter your option for update\n 1.name 2.Qualification 3.Salary");
		sc = new Scanner(System.in);
		int option =sc.nextInt();
		
		Trainer t = new Trainer();
		switch (option) {
		case 1:
			pst = connection.prepareStatement("update Trainer set tname=? where tid=? ");
			System.out.println("Enter Trainer tId");
			t.setTid(sc.nextInt());
			System.out.println("Enter Trainer tname");
			t.setTname(sc.next());
			pst.setInt(2, t.getTid());
			pst.setString(1, t.getTname());
			int i = pst.executeUpdate();
			if (i != 0)
				System.out.println("1 Record updated");
			else
				System.out.println(" Record not updated");
            break;
		case 2:
			pst = connection.prepareStatement("update Trainer set tname=? where tid=? ");
			System.out.println("Enter Trainer tId");
			t.setTid(sc.nextInt());
			System.out.println("Enter Trainer tname");
			t.setQualification(sc.next());
			pst.setInt(2, t.getTid());
			pst.setString(1, t.getTname());
			i = pst.executeUpdate();
			if (i != 0)
				System.out.println("1 Record updated");
			else
				System.out.println(" Record not updated");
			break;
		case 3:
			pst = connection.prepareStatement("update Trainer set salary=? where tid=? ");

			System.out.println("Enter Trainer Id");
			t.setTid(sc.nextInt());
			System.out.println("Enter Trainer salary");
			t.setSalary(sc.nextInt());
			pst.setInt(2, t.getTid());
			pst.setInt(1, t.getSalary());

			i = pst.executeUpdate();
			if (i != 0)
				System.out.println("1 Record updated");
			else
				System.out.println(" Record not updated");
			break;
		default:System.out.println("not a valid option");
		     break;
		}

		pst.close();

	}

	void getAllTeachers(Connection connection) throws SQLException {
		pst = connection.prepareStatement("select * from Trainer");
		ResultSet rset = pst.executeQuery();

		while (rset.next()) {
			System.out.println("------------------------------------------------------");
			System.out.println(rset.getInt(1) + "  " + rset.getString(2) + "  " + rset.getString(3) + "  "
					+ rset.getInt(4) + "  " + rset.getInt(5));
			System.out.println("------------------------------------------------------");
		}

	}

	void deleteTeacher(Connection connection) throws SQLException {
		pst = connection.prepareStatement("delete from Trainer where tid=355");
		int i = pst.executeUpdate();
		if (i != 0)
			System.out.println("1 Record deleted");
		else
			System.out.println(" Record not deleted");
		pst.close();

	}

	public static void main(String[] args) throws SQLException {

		String url = null;
		String userName = null;
		String password = null;

		TrainerApplication teacher = new TrainerApplication();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/ajpcore";
			userName = "root";
			password = "root";
			// 2. Creating the connection
			connection = DriverManager.getConnection(url, userName, password);
			// 3.creating PreparedStatement
			//teacher.insertTeacher(connection);
			 teacher.updateTeacher(connection);
			/*
			 * teacher.deleteTeacher(connection); 
			 * teacher.getAllTeachers(connection);
			 */
			connection.close();

		} catch (SQLException e) {
			System.out.println("Sql exception");

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found exception");
		}

	} 
}