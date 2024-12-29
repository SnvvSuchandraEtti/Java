import javax.swing.*;

public class GuiExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(560, 560);
        frame.setResizable(false);
        frame.setLayout(null);

        // Assuming you have an image file at the specified path
        ImageIcon img = new ImageIcon("D:\\Programs Codes\\java gui\\instagram.png");
        // Assuming there's a JLabel to display the image
        JLabel label = new JLabel(img);
        label.setBounds(0, 0, 500, 500);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
