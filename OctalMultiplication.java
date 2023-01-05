import java.util.*;

class OctalMultiplication {
	static int dec(long userIn) {
		int decimal = 0, ctr = 0;
		long rem;
		while (userIn > 0) {
			rem = userIn % 10;
			userIn /=10;
			decimal += rem * Math.pow(8, ctr++);
		}
		return decimal;
	}

	public static int octprod(long oct1, long oct2) {
		int ans = 0, remainder;
		String product = "";

		ans = dec(oct1) * dec(oct2);

		if (oct1 == 0 || oct2 == 0) {
			System.out.println("\nRESULT: 0");
		} else {
			while (ans > 0) {
				remainder = ans % 8;
				product = remainder + "" + product;
				ans /= 8;
			}
			System.out.println("\nRESULT: " + product);
		}
		return (0);
	}
}