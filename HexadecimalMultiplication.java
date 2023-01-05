import java.util.*;

class HexadecimalMultiplication {
	static long hex2dec(String hexVal) {
		String digits = "0123456789ABCDEF";
		hexVal = hexVal.toUpperCase();
		long val = 0;
		for (int ctr = 0; ctr < hexVal.length(); ctr++) {
			char len = hexVal.charAt(ctr);
			int dec = digits.indexOf(len);
			val = 16 * val + dec;
		}
		return val;
	}

	public static String prod(String usIn1, String usIn2) {
		String product = "";
		char hexNuma[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		long ans=0;
		int rem;

		ans = hex2dec(usIn1) * hex2dec(usIn2);

		if (usIn1.equals("0") || usIn2.equals("0")) {
			System.out.println("\nRESULT: 0");
		} else {
			while (ans > 0) {
				rem = (int) (ans % 16);
				product = hexNuma[rem] + "" + product;
				ans /= 16;
			}

			System.out.println("\nRESULT: " + product + "\n");
		}
		return product;
	}
}