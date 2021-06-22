
public class MySQLDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Connecting MySQL.....");
		
	}

	@Override
	public void use() {
		System.out.println("Performing Transaction in MySQL");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from MySQL");
		
	}

}
