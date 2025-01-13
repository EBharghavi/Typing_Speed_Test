import java.util.Scanner;

public class TypingSpeedTest {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Sample sentence to be typed
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Your task is to type the following sentence as fast as you can:\n");
        System.out.println("\"" + sentence + "\"");
        System.out.println("Press Enter when you're ready to start...");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Wait for the user to press Enter

        // Start timing
        long startTime = System.currentTimeMillis();

        System.out.println("Start typing now!");

        // Capture the user input
        String typedSentence = scanner.nextLine();

        // Stop timing
        long endTime = System.currentTimeMillis();

        // Calculate the time taken (in seconds)
        double timeTaken = (endTime - startTime) / 1000.0;

        // Compare the input sentence with the original sentence
        if (typedSentence.equals(sentence)) {
            // Calculate words per minute (WPM)
            int wordCount = sentence.split(" ").length;
            double wordsPerMinute = (wordCount / timeTaken) * 60;

            System.out.println("Well done! You took " + timeTaken + " seconds.");
            System.out.println("Your typing speed is " + String.format("%.2f", wordsPerMinute) + " words per minute.");
        } else {
            System.out.println("Oops! The sentence you typed doesn't match the original.");
        }

        scanner.close();
    }
}
