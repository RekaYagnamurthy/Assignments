package assignments;

public class Assignment14_DiamondShapedPyramid {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int n = numbers.length;

		// Upper part
		for (int i = 0; i < n; i++) {

			// Print spaces
			for (int s = 0; s < n - i - 1; s++) {
				System.out.print(" ");
			}

			// Print numbers from array
			for (int j = 0; j <= i; j++) {
				System.out.print(numbers[j] + " ");
			}

			System.out.println();
		}

		// Lower part
		for (int i = n - 2; i >= 0; i--) {

			// Print spaces
			for (int s = 0; s < n - i - 1; s++) {
				System.out.print(" ");
			}

			// Print numbers from array
			for (int j = 0; j <= i; j++) {
				System.out.print(numbers[j] + " ");
			}

			System.out.println();
		}

	}

}
