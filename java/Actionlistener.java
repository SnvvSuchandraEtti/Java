import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class ComboBox {
    public static void main(String[] args) {

        //frame creation
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("ComboBox");

        //icon set
        ImageIcon img = new ImageIcon("D:/Programming/JAVA/GUIExample3/WhatsApp Image 2024-03-16 at 09.44.02_0aa3830c.jpg");
        frame.setIconImage(img.getImage());


        //combobox
        String[] boxItems = {"Apple","mango","chakulettu"};
        JComboBox<String> box = new JComboBox<>(boxItems);
        box.setFont(new Font("MV Boil",Font.BOLD,15));
        box.setSelectedItem(null);
        box.setForeground(Color.RED);
        box.setBackground(Color.GRAY);
        // box.addItem("apple");
        // box.addItem("Banana");
        // box.addItem("Pine apple");
        box.setBounds(200,200,100,50);

        //Label
        JLabel lbl1 = new JLabel();
        lbl1.setBounds(200,300,100,50);
        lbl1.setOpaque(true);

        String[] association = {"Apple is red","mango is yello","tassu rupeyy ka chakulettu"};

        // action listener Annoymous
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int ind = box.getSelectedIndex();
                JOptionPane.showMessageDialog(null,association[ind]);
            }
        });

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1){
                if(box.getSelectedItem().equals("Apple")){
                    lbl1.setBackground(Color.red);
                }
            }
        });


        //visability
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding
        frame.add(lbl1);
        frame.add(box);
    }    
}