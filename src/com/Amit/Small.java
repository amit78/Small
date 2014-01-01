package com.Amit;

import javax.swing.*;

/**
 * Created by Amit on 22/12/13.
 */
public class Small {

    private static String input;
    private static int integers;
    private static int number;
    private static int smallest;

    public static void main(String[] args) {


        input = JOptionPane.showInputDialog("Enter number of integers");
        integers = Integer.parseInt(input);


        for (int counter = 1; counter <= integers; counter++) {
            input = JOptionPane.showInputDialog("Enter integer");
            number = Integer.parseInt(input);

            if (counter == 1) {
                smallest = number;

            } else if (number < smallest) {
                smallest = number;
            }
        }
        JOptionPane.showMessageDialog(null, "Smallest Integer is:" + smallest, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
