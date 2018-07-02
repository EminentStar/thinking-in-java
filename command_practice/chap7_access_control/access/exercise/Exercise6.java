class TestClass6 {
	protected int i = 1224;
}

public class Exercise6 {
	public void manipulate() {
		TestClass6 t = new TestClass6();
		t.i++;

		System.out.println("After manipulated: " + t.i);
	}

	public static void main(String[] args) {
		Exercise6 e = new Exercise6();
		e.manipulate();
	}
}
