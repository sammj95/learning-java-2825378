import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        System.out.println("Hello World from the IntelliJ IDE!");

        /** Student */
        // Reference data types
        String studentFirstName = "Samantha";
        String studentLastName = "Johnson";

        // Primitive data types
        int studentAge = 15;
        double studentGPA = 3.65;
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        System.out.println(studentFirstName+' '+studentLastName + " has a GPA of " + studentGPA);

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

        /** Fortune Teller */
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

        /** Song */
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song.");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

        /** Quiz */
        String question = "What is my favorite color?";
        String choiceOne = "Blue";
        String choiceTwo = "Red";
        String choiceThree = "Green";

        String correctAnswer = choiceThree.toLowerCase();

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question + " " + choiceOne + " " + choiceTwo + " " + choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        if (correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }
    }
}
