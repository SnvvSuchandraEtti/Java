import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JLabel label;
    private JButton button;

    public SimpleGUI() {
        setTitle("Simple GUI Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        label = new JLabel("Prpanchaniki Vandhanam");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Create button
        button = new JButton("Ikkada Nokkaku");
        button.addActionListener(new ButtonClickListener());

        // Set layout
        setLayout(new BorderLayout());

        // Add components to content pane
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("Endhuku bro  Nannu Nokkav?");
            label.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleGUI gui = new SimpleGUI();
                gui.setVisible(true);
            }
        });
    }
}
