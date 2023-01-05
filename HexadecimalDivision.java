import java.util.*;

class HexadecimalDivision {
	public static long hex2dec(String hexVal) {
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

	static String dec2hex(long val) {
		int rem;
		String hex = "";
		char hexNuma[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		while (val > 0) {
			rem = (int)(val % 16);
			hex = hexNuma[rem] + hex;
			val = val / 16;
		}
		return hex;
	}

	public static int quo(String dividend, String divisor) {
		long quotient = 0, dividend2 = 0, divisor2 = 0;

		dividend2 = hex2dec(dividend);
		divisor2 = hex2dec(divisor);

		if (divisor2 > dividend2) {
			if (dividend2 == 0) {
				System.out.println("\nRESULT: 0");
			} else {
				System.out.print("\nRESULT: 0" + " remainder " + dec2hex(dividend2) + "\n");
			}
		} else if (divisor.equals("0")) {
			System.out.println("\nRESULT: Cannot divide by 0!");
		} else {
			while (dividend2 >= divisor2) {
				dividend2 = dividend2 - divisor2;
				quotient++;
			}
			if (dividend2 == 0) {
				System.out.print("\nRESULT: " + dec2hex(quotient) + "\n");
			} else {
				System.out.print("\nRESULT: " + dec2hex(quotient) + " remainder " + dec2hex(dividend2) + "\n");
			}
		}
		return (0);
	}
}