import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class DoSomething implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Abba Nokkesadu Baboi...");
    }
}
public class GuiExample1 {
    public static void main(String[] args) {

        //window creation
        JFrame window = new JFrame();
        window.setLayout(null);
        window.setResizable(true);
        window.setTitle("mouli");
        window.getContentPane().setBackground(Color.green);
        window.setSize(500,500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Label
        JLabel lbl1 = new JLabel();
        lbl1.setText("Chandra Darling");
        lbl1.setForeground(Color.yellow);

        //font
        Font myFont = new Font("MV Boil",Font.BOLD,25);
        lbl1.setFont(myFont);
        lbl1.setBounds(600,400,300,30);

        //button
        JButton btn = new JButton();
        btn.setText("Nannu Nokkochuga");
        btn.setBounds(630, 450, 150, 32);

        //action Listener
        btn.addActionListener(new DoSomething());

        //window add
        window.add(lbl1);
        window.add(btn);
    }
}