import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Main extends JFrame {

    JTextField accNo, name, balance;
    JTextArea area;
    Connection con;

    public Main() {

        setTitle("Bank Database");
        setSize(450, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Account No"));
        accNo = new JTextField(10);
        add(accNo);

        add(new JLabel("Name"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Balance"));
        balance = new JTextField(10);
        add(balance);

        JButton insert = new JButton("Insert");
        JButton edit = new JButton("Edit");
        JButton delete = new JButton("Delete");
        JButton show = new JButton("Show");

        add(insert);
        add(edit);
        add(delete);
        add(show);

        area = new JTextArea(30, 30);
        add(new JScrollPane(area));

        try {
          
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "12345"   
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        insert.addActionListener(e -> {
            try {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO bank VALUES(?,?,?)"
                );

                ps.setInt(1, Integer.parseInt(accNo.getText()));
                ps.setString(2, name.getText());
                ps.setDouble(3, Double.parseDouble(balance.getText()));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null,
                        "Inserted Successfully");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        edit.addActionListener(e -> {
            try {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE bank SET customerName=?, balance=? WHERE accountNo=?"
                );

                ps.setString(1, name.getText());
                ps.setDouble(2, Double.parseDouble(balance.getText()));
                ps.setInt(3, Integer.parseInt(accNo.getText()));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Updated");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        delete.addActionListener(e -> {
            try {
                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM bank WHERE accountNo=?"
                );

                ps.setInt(1, Integer.parseInt(accNo.getText()));
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Deleted");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        show.addActionListener(e -> {
            try {
                area.setText("");

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM bank");

                while (rs.next()) {
                    area.append(
                        rs.getInt("accountNo") + "   " +
                        rs.getString("customerName") + "   " +
                        rs.getDouble("balance") + "\n"
                    );
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}