import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener; // Interface
import java.awt.event.ActionEvent; // Class
import javax.swing.JTextField;
// Anonymous implementation of an interface
public class Manual {
    public static void main(String[] args) {
        // An object of JFrame class
        JFrame window = new JFrame();
        window.setTitle("My Frame");
        window.setResizable(false); // restrict from resizing
        window.setSize(500, 500); // Used to set the size of the window
        window.setLayout(null); // No Layouts
//        window.getContentPane().setBackground(Color.red);
        // Label -> JLabel -> swing
        // An object of JLabel class
        JLabel lb1 = new JLabel();
        lb1.setText("This is my first Java GUI Program");
        lb1.setBounds(50, 150, 450, 30); // 0-Position on X-Axis, 300-Position on Y-Axis
        // 300-width of label, 20 is length of label
        lb1.setForeground(Color.red);
        lb1.setFont(new Font("MV Boli", Font.BOLD, 25));
        // TextFields are used to get data from user
        // JTextField
        JTextField tf1 = new JTextField();
        tf1.setFont(new Font("MV Boli", Font.BOLD, 20));
        tf1.setBounds(190, 200, 200, 50);

        // YOu need to create an object of JButton class
        JButton button = new JButton();
        button.setText("Click Me!");
        button.setBounds(50, 200, 120, 100);
        // actionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputString = tf1.getText();
                System.out.println("Hello " + inputString);
                tf1.setText(""); // To Empty the TextField
            }
        });

        // Add component to window
        window.add(lb1);
        window.add(button);
        window.add(tf1);
        window.setVisible(true); // Makes window visible
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}