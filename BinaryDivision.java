import java.util.*;

class BinaryDivision {
	public static long bin2dec(long val){
		long decimal = 0, ctr = 0;

		while(val != 0){
			decimal += ((val%10)*Math.pow(2,ctr));
			val = val/10;
			ctr++;
		}
		return decimal;
	}

	static String dec2bin(long val) {
		int remainder;
		String binary = "";
		while (val > 0) {
			remainder = (int) (val % 2);
			binary = remainder + "" + binary;
			val /= 2;
		}
		return binary;
	}

	public static int quo(long dividend, long divisor) {
		long quotient = 0;
		long dividend2 = bin2dec(dividend);
		long divisor2 = bin2dec(divisor);

		if (divisor2 > dividend2) {
			if (dividend2 == 0) {
				System.out.println("\nRESULT: 0");
			} else {
				System.out.print("\nRESULT: 0 remainder " + dec2bin(dividend2) + "\n");
			}
		} else if (divisor == 0) {
			System.out.println("\nRESULT: Cannot divide by 0!");
		} else {
			while(dividend2 >= divisor2){
				dividend2 = dividend2 - divisor2;
				quotient++;
			}
			if (dividend2 == 0) {
				System.out.print("\nRESULT: " + dec2bin(quotient) + "\n");
			} else {
				System.out.print("\nRESULT: " + dec2bin(quotient) + " remainder " + dec2bin(dividend2) + "\n");
			}
		}
		return (0);
	}
}