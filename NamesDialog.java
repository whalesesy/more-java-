import javax.swing.JOptionPane;

public class NamesDialog {
        public static void main(String[] args) {
            String firstName;
            String lastName;
            int age;
            firstName = JOptionPane.showInputDialog("Enter your  first name");
            lastName = JOptionPane.showInputDialog("Enter your last name");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            JOptionPane.showMessageDialog(null, firstName + " " + lastName + " " + age);
            System.exit(0);
        }
    }
