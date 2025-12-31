package assignments;

public class Assignment15_StringOperations1 {

	public static void main(String[] args) {
	
		String sentence = "Java programming is fun and challenging";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // 1. Count total number of words
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        // 2. Print words in reverse order
        System.out.print("Sentence in reverse order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        // 3. Convert first character of each word to uppercase
        System.out.print("Sentence with first letter capitalized: ");
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            char firstChar = word.charAt(0);
            String remainingChars = word.substring(1);

            // Convert first character to uppercase
            String capitalWord = Character.toUpperCase(firstChar) + remainingChars;

            System.out.print(capitalWord + " ");

	  }
	}
}
