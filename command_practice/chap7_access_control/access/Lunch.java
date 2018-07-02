class Soup1 {
	private Soup1() {}

	/**
	 * (1) Allow creation via static method
	 */
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();

	/**
	 * (2) Create a static object and return a reference 
	 * upon request.(The `Singleton` pattern)
	 */
	public static Soup2 access() {
		return ps1;
	}

	public void f() {
		System.out.println("Soup2.f()");
	}
}

public class Lunch {
	void testPrivate() {
		//! Soup1 soup = new Soup1(); // Can't do this.
	}

	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.access().f();
	}
}
