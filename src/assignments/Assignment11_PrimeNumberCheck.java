package assignments;
  /* 1.Given a number n, determine whether it is a prime number or not. A prime
     number is a number greater than 1 that has no positive divisors other than 1 and itself.*/

public class Assignment11_PrimeNumberCheck {

	public static void main(String[] args) {

		int[] numbers = { 7, 25, 1 };

		for (int n : numbers) {

			boolean isPrime = true;

			if (n <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}

	}
}
