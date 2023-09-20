import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.util.*;
public class jdbc {
	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1","root","root");
			if(connection == null)
			{
				System.out.println("some problem");
			}
			else
			{
				System.out.println("connnection successful");
			}
			
			Statement st=connection.createStatement();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter salary:");
			float salary=sc.nextFloat();
			int x = st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
			System.out.println(x +" Record added");
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
