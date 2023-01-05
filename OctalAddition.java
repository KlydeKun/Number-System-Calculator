import java.util.*;

class OctalAddition {
	public static int octadd(long oct1, long oct2) {
		int ctr = 0, carry = 0;
		int[] sum = new int[100];

		if (oct1 == 0 && oct2 == 0) {
			System.out.println("\nRESULT: 0");
		} else {
			while(oct1 > 0 || oct2 > 0) {
				sum[ctr++] = (int)((oct1 % 10 + oct2 % 10 + carry) % 8);
				carry = (int)((oct1 % 10 + oct2 % 10 + carry) / 8);
				oct1 /= 10;
				oct2 /= 10;
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