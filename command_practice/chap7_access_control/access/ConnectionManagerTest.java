public class ConnectionManagerTest {
	public static void main(String[] args) {
		ConnectionManager connectionManager = new ConnectionManager(); 
		Object c = connectionManager.getConnection();
		int i = 1;

		while (c != null) {
			System.out.println(i + " th connection is not null");
			c = connectionManager.getConnection();
			i++;
		}

		System.out.println(i + " th: run out of connection pool.");
	}
}
