package assignments;

public class Assignment16_StringOperations2 {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		// 1. Divide paragraph into words
		String[] words = paragraph.split(" ");

		int count = 0;

		System.out.print("Indexes of word 'Java': ");

		// 2 & 3. Find occurrences and print indexes
		for (int i = 0; i < words.length; i++) {

			// Remove punctuation like . , from words
			String word = words[i].replace(".", "").replace(",", "");

			if (word.equals("Java")) {
				count++;
				System.out.print(i + " ");
			}
		}

		// Print total count
		System.out.println();
		System.out.println("Total occurrences of 'Java': " + count);
	}

}
