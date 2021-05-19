import java.util.ArrayList;
/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-17
 */

public class MarlonStack {
    // Class for MarlonStack

    // properties
    /**
    * This is the Arraylist.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    // methods
    /**
    * This method pushes user input into the list.
    * @param userInput This is the user input.
    */
    public void push(final int userInput) {
        // adds user input to list
        stackAsList.add(userInput);
    }

    // getters
    /**
    * This method pops the first element of a list.
    * @return popElement This returns the first element.
    */
    public int pop() {
        // pops the top element in a list
        int popElement = this.stackAsList.get(stackAsList.size() - 1);

        stackAsList.remove(stackAsList.size() - 1);

        return popElement;
    }

    /**
    * This gets the rest of the list.
    * @return restOfList This returns the rest of the list.
    */
    public String showStack() {
        // variable
        String restOfList = "The rest of the list contains: ";
        // counter
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            // gets each element
            restOfList = restOfList + stackAsList.get(counter) + ", ";
        }
        return restOfList;
    }
}
