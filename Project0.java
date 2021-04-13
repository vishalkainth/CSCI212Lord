import javax.swing.*;

/**
 * @author Vishal Kainth
 * @professor Cuiyuan Wang
 * @version 1
 * @class CSCI 212 11B
 * @description Java program to ask the user to type in a sentence. The program
 *              will examine each letter in the string and count how many time
 *              the upper-case letter 'E' appears, and how many times the
 *              lower-case letter 'e' appears. Repeat this process until the
 *              user types the word "Stop".
 * @definations
 *      1) upperCase: used to find uppercase E's
 *      2) lowerCase: used to find lowercase e's
 *      3) message: the sentence the user enters
 *      4) QUESTION_MESSAGE: static JOptionPane field
 *      5) INFORMATION_MESSAGE: static JOptionPane field
 * 
 */

public class Project0 {
    public static int upperCase = 0;        // Static variables belong to a class. There is only one variable for every instance of the class. Assigned at zero.
    public static int lowerCase = 0;

    public static void main(String[] args) {
        while (true)        // While Loop
        {
            // Input
            String message = JOptionPane.showInputDialog(null, "Please enter a sentence. ", "input",
                    JOptionPane.QUESTION_MESSAGE);                          // User to type in a setence

            // Examine each letter in the string
            if (!"STOP".equalsIgnoreCase(message) && message != null) {     // "STOP" to end program

                for (int i = 0; i < message.length(); i++) {
                    char x = message.charAt(i);                             // Reads the sentence
                    if (x == 'E')                                           // Checks for upcase E
                        upperCase++;
                    else if (x == 'e')                                      // Checks for lowercase e
                        lowerCase++;
                }

                // Output result
                String out = "Number of lower case e's: " + lowerCase + "\nNumber of upper case E's: " + upperCase;       // Answers the question
                JOptionPane.showMessageDialog(null, out, "Message", JOptionPane.INFORMATION_MESSAGE);                     // Prints the result

            } else
                System.exit(0);     // Terminate the program
        }
    }
}

