import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class ComboBox {
    public static void main(String[] args) {

        //frame creation
        JFrame frame = new JFrame();
        frame.setSize(1040,960);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("ComboBox");

        //icon set
        ImageIcon img = new ImageIcon("D:\\Programs Codes\\java gui\\Fruit.png");
        frame.setIconImage(img.getImage());

        //combobox
        String[] boxItems = {"Apple","Mango","Watermelon", "Orange", };
        JComboBox box = new JComboBox<>(boxItems);
        Font originalFont = box.getFont();
Font modifiedFont = originalFont.deriveFont(Font.BOLD, 15);
box.setFont(modifiedFont);
        box.setForeground(Color.blue);
        box.setBackground(Color.GRAY);
        // box.addItem("apple");
        // box.addItem("Banana");
        // box.addItem("Watermelon");
        // box.addItem("Orange");
        box.setBounds(200,200,180,50);

        // action listener Annoymous
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(box.getSelectedItem());
                System.out.println(box.getSelectedIndex());
            }
        });

        //visability
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding
        frame.add(box);
    }    
}