import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // // Ask for a single character
        // System.out.print("Enter a character: ");
        // char character = scanner.next().charAt(0);

        // // Ask for a word
        // System.out.print("Enter a word: ");
        // String word = scanner.next();

        // // Ask for a sentence
        // scanner.nextLine(); // Consume newline left-over from previous input
        // System.out.print("Enter a sentence: ");
        // String sentence = scanner.nextLine();

        // // Display the inputs
        // System.out.println("Character: " + character);
        // System.out.println("Word: " + word);
        // System.out.println("Sentence: " + sentence);

        System.out.println("_____________________________________________");

        System.out.print("Enter a number to get Multipication table:");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.print("Enter a number:");
        int userInput = scanner.nextInt();

        if(userInput %2 == 0){
        System.out.println(userInput + " is even number");
        }
        if(userInput == 0){
        System.out.println("User Input is :" + userInput);

        }
        if(userInput < 0){
        System.out.println("User Input is negative number :" + userInput);

        }
        else{
        System.out.println("User Input is odd Number :" + userInput);
        }


        scanner.close();
    }
}
