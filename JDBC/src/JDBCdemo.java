import java.sql.*;
public class JDBCdemo {

	public static void main(String[] args) throws SQLException {
		try {
			update();//call which method you need to run
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//Read query
	public static void readRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		String query =  "select * from employee";
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
		}
		con.close();
	}
	// insert query
	public static void insertRecord() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		String query =  "insert into employee values (4,'rajan',240000)";

		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: "+ rows);
		con.close();
	}
	// insert with variables
	public static void insertvar() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		
		int id = 5;
		String name = "sudharsan";
		int salary = 400000;
		
		// "insert into employee values(5,'sudharsan',300000);"
		String query =  "insert into employee values ("+ id +",'"+ name + "'," + salary + ");";
		
	
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: "+ rows);
		con.close();
	}
	// insert using prepared statement
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		
		int id = 6;
		String name = "kamalesh";
		int salary = 450000;
		
		// "insert into employee values(5,'sudharsan',300000);"
		String query =  "insert into employee values (?,?,?);";//prepared statement
		
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();
		
		System.out.println("Number of rows affected: "+ rows);
		con.close();
	}
	//delete
	public static void delete() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";
		
		int id = 5;

		
		
		String query =  "delete from employee where emp_id = "+ id;
		
	
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: "+ rows);
		con.close();
	}
	//update
	public static void update() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "";

		
		
		String query =  "update employee set salary = 3000000 where emp_id = 1 ";
		
	
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: "+ rows);
		con.close();
	}
	
	
}
