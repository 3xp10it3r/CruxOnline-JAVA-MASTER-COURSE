package Section9_TimeAndSpace;

import java.util.Arrays;

public class SieveOfEratothenis {
	public static void main(String[] args) {
			SOE(100);
	}

	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);

		primes[0] = primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == true) {
				for (int multiplier = 2; table * multiplier <= n; multiplier++){
					primes[table * multiplier] = false;
				}
			}
		}
		
		for(int i = 0 ; i <= n ;i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}
}
