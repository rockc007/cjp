1)Design an AWT application to check whether the number entered in textbox is
Even or not

import java.awt.*;
import java.awt.event.*;

public class EvenOddAWT extends Frame implements ActionListener {
    
    // Declare GUI components
    Label label1, label2;
    TextField textField;
    Button button;

    public EvenOddAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        label1 = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Check Even/Odd");
        label2 = new Label("Result: ");

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to frame
        add(label1);
        add(textField);
        add(button);
        add(label2);

        // Frame properties
        setSize(300, 150);
        setTitle("Even or Odd Checker");
        setVisible(true);

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Get number from text field
            int num = Integer.parseInt(textField.getText());

            // Check if the number is even or odd
            if (num % 2 == 0) {
                label2.setText("Result: Even");
            } else {
                label2.setText("Result: Odd");
            }
        } catch (NumberFormatException ex) {
            label2.setText("Invalid input! Enter a valid number.");
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        new EvenOddAWT();
    }
}


2)Design an AWT application to calculate the factorial of a number

import java.awt.*;
import java.awt.event.*;

public class FactorialAWT extends Frame implements ActionListener {
    Label label1, label2;
    TextField textField;
    Button button;

    public FactorialAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        label1 = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Calculate Factorial");
        label2 = new Label("Result: ");

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to frame
        add(label1);
        add(textField);
        add(button);
        add(label2);

        // Frame properties
        setSize(300, 200);
        setTitle("Factorial Calculator");
        setVisible(true);

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(textField.getText());
            long fact = factorial(num);
            label2.setText("Result: " + fact);
        } catch (NumberFormatException ex) {
            label2.setText("Invalid input! Enter a number.");
        }
    }

    // Method to calculate factorial
    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        new FactorialAWT();
    }
}


3)Design an AWT application to accept a number from user through textbox and
            print its reverse.



import java.awt.*;
import java.awt.event.*;

public class ReverseNumberAWT extends Frame implements ActionListener {
    Label label1, label2;
    TextField textField;
    Button button;

    public ReverseNumberAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        label1 = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Reverse Number");
        label2 = new Label("Result: ");

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to frame
        add(label1);
        add(textField);
        add(button);
        add(label2);

        // Frame properties
        setSize(300, 200);
        setTitle("Reverse Number");
        setVisible(true);

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(textField.getText());
            int reversedNum = reverseNumber(num);
            label2.setText("Result: " + reversedNum);
        } catch (NumberFormatException ex) {
            label2.setText("Invalid input! Enter a number.");
        }
    }

    // Method to reverse a number
    public int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;  // Get last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            n /= 10;  // Remove last digit
        }
        return reverse;
    }

    public static void main(String[] args) {
        new ReverseNumberAWT();
    }
}





Write a Java AWT program to accept a number from user (TextBox) and display
the cube of the number

import java.awt.*;
import java.awt.event.*;

public class CubeCalculatorAWT extends Frame implements ActionListener {
    Label label1, label2;
    TextField textField;
    Button button;

    public CubeCalculatorAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        label1 = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Calculate Cube");
        label2 = new Label("Result: ");

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to frame
        add(label1);
        add(textField);
        add(button);
        add(label2);

        // Frame properties
        setSize(300, 200);
        setTitle("Cube Calculator");
        setVisible(true);

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(textField.getText());
            int cube = num * num * num;
            label2.setText("Result: " + cube);
        } catch (NumberFormatException ex) {
            label2.setText("Invalid input! Enter a number.");
        }
    }

    public static void main(String[] args) {
        new CubeCalculatorAWT();
    }
}
