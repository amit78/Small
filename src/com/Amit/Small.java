package com.Amit;

import javax.swing.*;

/**
 * Created by Amit on 22/12/13.
 */
public class Small {

    private static String input;
    private static int integers;
    private static int number1;
    private static int smallest;

    public static void main(String[] args) {


        input = JOptionPane.showInputDialog("Enter number of integers");
        integers = Integer.parseInt(input);


        for (int counter = 1; counter <= integers; counter++) {
            input = JOptionPane.showInputDialog("Enter integer");
            number1 = Integer.parseInt(input);

            if (counter == 1) {
                smallest = number1;

            } else if (number1 < smallest) {
                smallest = number1;
            }
        }
        JOptionPane.showMessageDialog(null, "Smallest Integer is:" + smallest, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
