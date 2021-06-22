
public class TestDBConnection {

	public static void main(String[] args) {
		ConnectDB con;
		con =new OracleDriver();
		con.connect();
		con.use();
		con.disconnect();

	}

}
