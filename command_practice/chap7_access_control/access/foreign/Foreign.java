package access.foreign;

import access.local.*;

public class Foreign {
	/**
	 * Exercise9: PackagedClass cannot be acceessed in Foreign class.
	 * That's because PackagedClass and Foreign aren't in the same package(access.local/access/foreign)
	 * and also access control of PackagedClass class is default(package access).
	 */
	public static void main(String[] args) {
		PackagedClass pc = new PackagedClass();
	}
}
