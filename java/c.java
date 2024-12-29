import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ImageDisplay extends JFrame {
    private JLabel imageLabel;
    private JTextField rollNoField;
    private JButton displayButton;

    public ImageDisplay() {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create a panel for input components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        // Create a label and text field for entering roll number
        JLabel rollNoLabel = new JLabel("Enter Roll No:");
        rollNoField = new JTextField(10);

        // Create a button to display the image
        displayButton = new JButton("Display Image");

        // Add components to the input panel
        inputPanel.add(rollNoLabel);
        inputPanel.add(rollNoField);
        inputPanel.add(displayButton);

        // Create a label to display the image
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add the input panel and image label to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER);

        // Attach listener to the display button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rollNo = rollNoField.getText();
                // Modify the image URL based on the roll number entered
                String imageUrl = "https://example.com/images/roll_" + rollNo + ".jpg";
                displayImageFromURL(imageUrl);
            }
        });
    }

    public void displayImageFromURL(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            ImageIcon imageIcon = new ImageIcon(url);
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = new ImageDisplay();
            imageDisplay.setVisible(true);
        });
    }
}
