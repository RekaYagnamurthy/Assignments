package assignments;

public class Assignment17_TrianglePattern {

	public static void main(String[] args) {
		int rows = 5;

		// Outer loop for rows
		for (int i = 1; i <= rows; i++) {

			// Print spaces
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			// Move to next line
			System.out.println();
		}

	}

}
