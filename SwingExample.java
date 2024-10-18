import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingExample {

            public static void main(String[] args) {
            // Create a new JFrame
            JFrame frame = new JFrame("Swing Example");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null); // Use no layout manager

            // Create a label
            JLabel label = new JLabel("Enter your name:");
            label.setBounds(10, 20, 150, 25);
            frame.add(label);

            // Create a text field
            JTextField textField = new JTextField();
            textField.setBounds(150, 20, 120, 25);
            frame.add(textField);

            // Create a button
            JButton button = new JButton("Submit");
            button.setBounds(10, 60, 100, 25);
            frame.add(button);

            // Create an output label
            JLabel outputLabel = new JLabel("");
            outputLabel.setBounds(10, 100, 250, 25);
            frame.add(outputLabel);

            // Add action listener to the button
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = textField.getText(); // Get text from text field
                    outputLabel.setText("Hello, " + name + "!"); // Display greeting
                }
            });

            // Make the frame visible
            frame.setVisible(true);
        }
    }
