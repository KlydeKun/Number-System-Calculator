import java.util.*;

class BinaryMultiplication {
	static long dec(long userIn) {
		long decimal = 0;
		int ctr = 0;
		long rem;
		while (userIn > 0) {
			rem = userIn % 10;
			userIn /=10;
			decimal += rem * Math.pow(2, ctr++);
		}
		return decimal;
	}

	public static int prod(long bin1, long bin2) {
		long ans = 0, remainder;
		String product = "";

		ans = dec(bin1) * dec(bin2);
		if (bin1 == 0 || bin2 == 0) {
			System.out.println("\nRESULT: 0");
		} else {
			while (ans > 0) {
				remainder = ans % 2;
				product = remainder + "" + product;
				ans /= 2;
			}

			System.out.println("\nRESULT: " + product);
		}
		return (0);
	}
}