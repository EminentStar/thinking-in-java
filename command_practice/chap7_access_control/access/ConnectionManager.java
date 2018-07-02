public class ConnectionManager {
	private static Connection[] connectionPool = new Connection[10];
	private static int availableConnectionCount = 10;
	private static int currentGivableConnectionIndex = 0;

	static {
		for (int i = 0; i < 10; i++) {
			connectionPool[i] = new Connection();
		}
	}

	public static Connection getConnection() {
		if (availableConnectionCount < 1) {
			return null;
		}

		availableConnectionCount--;
		return connectionPool[currentGivableConnectionIndex++];
	}
}


