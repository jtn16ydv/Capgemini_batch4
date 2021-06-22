/**
 * This ConnectDB is used to perform DB operations, It is the responsibility of the implementation provider to provide the definition.
 * @author panka
 *
 */
public interface ConnectDB {
	
	/**
	 * This is used to connect with DB
	 */
	void connect();
	/**
	 * This is used to perform DB transaction
	 */
	void use();
	/**
	 * This is used to disconnect from DB
	 */
	void disconnect();

}
