import java.util.*;

class OctalDivision {
	public static long oct2dec(long val){
		long decimal = 0, ctr = 0;

		while(val != 0){
			decimal += ((val%10)*Math.pow(8,ctr));
			val = val/10;
			ctr++;
		}
		return decimal;
	}

	static String dec2oct(long val) {
		int remainder;
		String octal = "";
		while (val > 0) {
			remainder = (int) (val % 8);
			octal = remainder + "" + octal;
			val /= 8;
		}
		return octal;
	}

	public static int octquo(long dividend, long divisor) {
		long quotient = 0;
		long dividend2 = oct2dec(dividend);
		long divisor2 = oct2dec(divisor);

		if (divisor2 > dividend2) {
			if (dividend2 == 0) {
				System.out.println("\nRESULT: 0");
			} else {
				System.out.print("\nRESULT: 0 remainder " + dec2oct(dividend2) + "\n");
			}
		} else if (divisor == 0) {
			System.out.println("\nRESULT: Cannot divide by 0!");
		} else {
			while(dividend2 >= divisor2){
				dividend2 = dividend2 - divisor2;
				quotient++;
			}
			if (dividend2 == 0) {
				System.out.print("\nRESULT: " + dec2oct(quotient) + "\n");
			} else {
				System.out.print("\nRESULT: " + dec2oct(quotient) + " remainder " + dec2oct(dividend2) + "\n");
			}
		}
		return (0);
	}
}