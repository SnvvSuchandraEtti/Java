import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class StudentDatabaseApp {

    private static Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/suchandra";
        String user = "root";
        String password = "suchandra";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot connect to database: " + e.getMessage());
            return null;
        }
    }

    private static void insertStudent(Connection conn, String rollNo, String name, String college, String age, String branch) {
        String sql = "INSERT INTO students (roll_no, name, college, age, branch) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(rollNo));
            pstmt.setString(2, name);
            pstmt.setString(3, college);
            pstmt.setInt(4, Integer.parseInt(age));
            pstmt.setString(5, branch);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record inserted successfully!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inserting record: " + ex.getMessage());
        }
    }

    private static void updateStudent(Connection conn, String rollNo, String name, String college, String age, String branch) {
        String sql = "UPDATE students SET name = ?, college = ?, age = ?, branch = ? WHERE roll_no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, college);
            pstmt.setInt(3, Integer.parseInt(age));
            pstmt.setString(4, branch);
            pstmt.setInt(5, Integer.parseInt(rollNo));
            int updatedRows = pstmt.executeUpdate();
            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Record not found!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating record: " + ex.getMessage());
        }
    }

    private static void showStudentForm(String title, boolean isUpdate) {
        // Frame setup
        JFrame frame = new JFrame(title);
        frame.setSize(300, 300);
        frame.setLayout(null);

        // Components
        JLabel labelRollNo = new JLabel("Roll No:");
        labelRollNo.setBounds(10, 20, 80, 25);
        frame.add(labelRollNo);

        JTextField textRollNo = new JTextField();
        textRollNo.setBounds(100, 20, 165, 25);
        frame.add(textRollNo);

        JLabel labelName = new JLabel("Name:");
        labelName.setBounds(10, 50, 80, 25);
        frame.add(labelName);

        JTextField textName = new JTextField();
        textName.setBounds(100, 50, 165, 25);
        frame.add(textName);

        JLabel labelCollege = new JLabel("College:");
        labelCollege.setBounds(10, 80, 80, 25);
        frame.add(labelCollege);

        JTextField textCollege = new JTextField();
        textCollege.setBounds(100, 80, 165, 25);
        frame.add(textCollege);

        JLabel labelAge = new JLabel("Age:");
        labelAge.setBounds(10, 110, 80, 25);
        frame.add(labelAge);

        JTextField textAge = new JTextField();
        textAge.setBounds(100, 110, 165, 25);
        frame.add(textAge);

        JLabel labelBranch = new JLabel("Branch:");
        labelBranch.setBounds(10, 140, 80, 25);
        frame.add(labelBranch);

        JTextField textBranch = new JTextField();
        textBranch.setBounds(100, 140, 165, 25);
        frame.add(textBranch);

        JButton buttonSave = new JButton(isUpdate ? "Update" : "Insert");
        buttonSave.setBounds(10, 200, 80, 25);
        frame.add(buttonSave);

        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection conn = connectToDatabase();
                if (conn != null) {
                    if (isUpdate) {
                        updateStudent(conn, textRollNo.getText(), textName.getText(), textCollege.getText(), textAge.getText(), textBranch.getText());
                    } else {
                        insertStudent(conn, textRollNo.getText(), textName.getText(), textCollege.getText(), textAge.getText(), textBranch.getText());
                    }
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Main window setup
        JFrame window = new JFrame("Student Data Management");
        window.setLayout(null);
        window.setSize(300, 150);

        JButton insertButton = new JButton("Insert Student");
        insertButton.setBounds(50, 50, 150, 25);
        window.add(insertButton);

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showStudentForm("Insert Student", false);
            }
        });

        JButton updateButton = new JButton("Update Student");
        updateButton.setBounds(50, 100, 150, 25);
        window.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showStudentForm("Update Student", true);
            }
        });

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}