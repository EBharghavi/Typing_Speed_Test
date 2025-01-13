# Typing Speed Test

This Java-based Typing Speed Test application challenges users to type a sentence as quickly as possible and calculates their typing speed in words per minute (WPM). The program compares the user's input with the original sentence and provides feedback on accuracy and speed.

## Features

- The user is prompted to type a specific sentence.
- The time taken to type the sentence is measured.
- The program compares the user's typed sentence to the original sentence.
- If the typed sentence matches, the program calculates and displays the typing speed in words per minute (WPM).
- If the sentence doesn't match, an error message is displayed.

## Requirements

- Java 8 or later installed on your machine.
- A terminal or command prompt for running the program.

## Setup

1. **Clone or Download the Project**:
    - Clone the repository (if applicable):
      ```bash
      git clone https://github.com/yourusername/typing-speed-test.git
      ```

2. **Compile and Run**:
    - Open a terminal/command prompt and navigate to the directory where the `TypingSpeedTest.java` file is located.
    - Compile the Java file:
      ```bash
      javac TypingSpeedTest.java
      ```
    - Run the compiled Java program:
      ```bash
      java TypingSpeedTest
      ```

## How to Use

1. The program will display a sentence that you need to type.
2. Press Enter when you're ready to start.
3. Start typing the sentence as fast and accurately as you can.
4. After typing the sentence, press Enter again to submit your input.
5. The program will display the time taken in seconds and your typing speed in words per minute if the sentence matches.
6. If the sentence doesn't match, you'll be notified and asked to try again.

### Example Output

Your task is to type the following sentence as fast as you can:
```
"The quick brown fox jumps over the lazy dog."
Press Enter when you're ready to start...
Start typing now!
The quick brown fox jumps over the lazy dog.
Well done! You took 15.23 seconds.
Your typing speed is 24.00 words per minute.
```
### Error Output (if typed sentence doesn't match):
```
Oops! The sentence you typed doesn't match the original.
```

## Notes

- The program measures the time in seconds and calculates the typing speed using the number of words in the original sentence and the time taken.
- The original sentence used in the test is: "The quick brown fox jumps over the lazy dog."
  
