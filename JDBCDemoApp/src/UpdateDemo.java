import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class UpdateDemo {
	
	private static Logger logger = Logger.getLogger(UpdateDemo.class);

	public static void main(String[] args)  {
		//1: Gather the DB information
		String driverClassName ="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost/capgbatch4";
		String username="postgres";
		String password="admin";
		//2: Load or Register the Driver
		Class c;
		try {
			c = Class.forName(driverClassName);
			logger.info(c);
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		}
		
		
		//3: Create Connection Object
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			logger.info(con);
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		
		//4: Create SQL, get the Statement and execute sql
		String sql = "update employees set name='arzoo rehan' where id=1";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.execute(sql);
			logger.info(stmt);
			logger.info("Success: Record Updated");
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		
		
		
		//5: Release the resources
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
