import java.util.Scanner;
/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-17
 */

public final class StackForm {
    private StackForm() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method takes in user input.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, get user input here

        // constant
        final int three = 3;

        // Create new Scanner-type variable
        Scanner paramInput = new Scanner(System.in);

        // new instance
        MarlonStack myStack = new MarlonStack();

        // loop for user input
        for (int counter = 0; counter < three; counter++) {
            // asks user to input 3 numbers
            System.out.print("Please enter a number to add to the list: ");
            // check if input is an integer
            while (!paramInput.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Please enter a number to add to the list: ");
                paramInput.next(); // moves scanner until correct value
            }
            int userInput = paramInput.nextInt();

            // call method
            myStack.push(userInput);
        }
        System.out.println();

        // pop method
        System.out.println("The top element in the list is -> "
                            + myStack.pop());
        System.out.println();

        // call method
        System.out.println(myStack.showStack());

        // program closes
        System.out.println();
        System.out.println("Done.");
    }
}
