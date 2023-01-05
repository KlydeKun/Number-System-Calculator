import java.util.*;

class HexadecimalSubtraction {
	static long complement1 (long uIn, long max) {
		long maxDigit, digits = 0, num = uIn;
		int maxNum = 0;

		while (max!=0) {
			digits++;
			max /= 10;
		}
		maxDigit = 10 - 1;

		while((digits--) > 0) {
			maxNum = (int) (maxNum * 10 + maxDigit);
		}
		return ((long) (maxNum - num));
	}

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

	static String add(String add1, String add2) {
		String result = "";
		int sum = 0;
		int temp1 = add1.length()-1, temp2 = add2.length()-1;
		while (temp1 >=0 || temp2 >=0 || sum == 1) {
			sum += ((temp1>=0)? add1.charAt(temp1) - '0' : 0);
			sum += ((temp2>=0)? add2.charAt(temp2) - '0' : 0);

			result = (char) (sum % 10 + '0') + result;
			sum /=10;

			temp1--; temp2--;
		}
		return result;
	}

	static int ctr(long uIn) {
		int cnt = 0;
		while (uIn > 0) {
			uIn /=10;
			++cnt;
		}
		return cnt;
	}
	static String dec2hex(long decimal) {
		int remainder;
		String hexa = "";
		char hexNuma[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		while (decimal > 0) {
			remainder = (int)(decimal % 16);
			hexa = hexNuma[remainder] + "" + hexa;
			decimal /= 16;
		}
		return hexa;
	}

	public static int sub(String min, String sub) {
		String ansP = "";
		long temp1, ctrf = 0;
		long ans3;
		if (hex2dec(min) > hex2dec(sub)) {
			temp1 = complement1(hex2dec(sub), hex2dec(min));
			ansP = add(Long.toString(temp1), Long.toString(hex2dec(min)));
			long ans1 = Long.parseLong(ansP);
			if (ctr(ans1) > ctr(hex2dec(sub))) {
				String ans2 = Long.toString(ans1);
				ansP = add(ans2.substring(1), ans2.substring(0, (ans2.length() - (ans2.length()-1))));
				ans3 = Long.parseLong(ansP);
				System.out.println("\nRESULT: " + dec2hex(ans3));
			} else {
				System.out.println("\nRESULT: " + dec2hex(ans1));
			}
		} else {
			temp1 = complement1(hex2dec(sub), hex2dec(sub));
			ansP = add(Long.toString(temp1), Long.toString(hex2dec(min)));
			long ans1 = Long.parseLong(ansP);
			if (ctr(ans1) > ctr(hex2dec(sub))) {
				temp1 = complement1(ans1, hex2dec(sub));
				String ans2 = Long.toString(ans1);
				ansP = add(ans2.substring(1), ans2.substring(0, (ans2.length() - (ans2.length()-1))));
				ans3 = Long.parseLong(ansP);
				System.out.println("\nRESULT: -" + dec2hex(ans3));
			}
			else {
				temp1 = complement1(ans1, hex2dec(sub));
				if (temp1 == 0) {
					System.out.println("\nRESULT: 0");
				} else {
					System.out.println("\nRESULT: -" + dec2hex(temp1));
				}
			}
		}
		return (0);
	}
}