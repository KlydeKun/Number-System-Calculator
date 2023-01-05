import java.util.*;

class BinarySubtraction {
	static long complement1 (long uIn, long max, int base) {
		long maxDigit, digits = 0, num = uIn;
		long maxNum = 0;
		while (max !=0) {
			digits++;
			max = max / 10;
		}
		maxDigit = (base - 1);

		while ((digits--) > 0) {
			maxNum =(int)(maxNum * 10 + maxDigit);
		}
		return ((long) (maxNum - num));
	}
	static int ctr(long uIn) {
		int cnt = 0;
		while (uIn > 0) {
			uIn /=10;
			++cnt;
		}
		return cnt;
	}
	static String add(String add1, String add2, int base) {
		String result = "";

		int sum = 0;

		int temp1 = add1.length() - 1, temp2 = add2.length() - 1;
		while (temp1 >=0 || temp2 >= 0 || sum == 1) {
			sum += ((temp1>=0)? add1.charAt(temp1) - '0' : 0);
			sum += ((temp2>=0)? add2.charAt(temp2) - '0' : 0);

			result = (char) (sum % base + '0') + result;
			sum /= base;

			temp1--; temp2--;
		}
		return result;
	}

	public static int sub(long min, long sub) {
		long temp1 = 0;
		int base = 2, ctrf = 0;
		String ansf = "";

		if (min > sub) {
			temp1 = complement1(sub, min, base);
			ansf = add(Long.toString(temp1), Long.toString(min), base);
			long ans1 = Long.parseLong(ansf);
			if (ctr(ans1) > ctr(min)){
				String ans2 = Long.toString(ans1);
				ansf = add(ans2.substring(1), ans2.substring(0, (ans2.length()-(ans2.length()-1))), base);
				System.out.println("\nRESULT: " + ansf);
			}
			else {
				System.out.println("\nRESULT: " + ansf);
			}
		} else {
			temp1 = complement1(sub, sub, base);
			ansf = add(Long.toString(temp1), Long.toString(min), base);
			long ans1 = Long.parseLong(ansf);
			if(ctr(ans1) > ctr(sub)) {
				temp1 = complement1(ans1, sub, base);
				String ans2 = Long.toString(temp1);
				ansf = add(ans2.substring(1), ans2.substring(0, (ans2.length()-(ans2.length()-1))), base);
				System.out.println("\nRESULT: -" + ansf);
			}
			else {
				temp1 = complement1(ans1, sub, base);
				if(temp1 == 0) {
					System.out.println("\nRESULT: 0");
				} else {
					System.out.println("\nRESULT: -" + temp1);
				}
			}
		}
		return (0);
	}
}

