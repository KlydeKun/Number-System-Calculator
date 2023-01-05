import java.util.*;

class BinaryAddition {
	public static int add(long bin1, long bin2) {
		int ctr = 0, carry = 0;
		int[] sum = new int[100];

		if (bin1 == 0 && bin2 == 0) {
			System.out.println("\nRESULT: 0");
		} else {
				while(bin1 > 0 || bin2 > 0) {
				sum[ctr++] = (int)((bin1 % 10 + bin2 % 10 + carry) % 2);
				carry = (int)((bin1 % 10 + bin2 % 10 + carry) / 2);
				bin1 /= 10;
				bin2 /= 10;
			}
			if (carry>0) {
				sum[ctr++] = carry;
			}
			--ctr;
			System.out.print("\nRESULT: ");
			while (ctr >=0) {
				System.out.print(sum[ctr--]);
			}
			System.out.println("\n");
		}
		return (0);
	}
}